package myexcle;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-23 14:53
 * @description
 **/
public class ResolveExcle {

	public void resolve(Long projectId, Long versionId, String excelFileName) throws Exception {

		FileInputStream inputStream = new FileInputStream(excelFileName);
		boolean is03Excel = excelFileName.matches("^.+\\.(?i)(xls)$");
		Workbook workbook = is03Excel ? new HSSFWorkbook(inputStream) : new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(0);
		int totalRows = sheet.getLastRowNum();
		try{
			if (totalRows >= 2) {
			Row tmpRow = null;
			Stage stage = null;
			for (int k =1; k <= totalRows; k++){
				tmpRow = sheet.getRow(k);
				if(tmpRow != null){
					Cell cell0 = tmpRow.getCell(0);
					Cell cell1 = tmpRow.getCell(1);
					Cell cell2 = tmpRow.getCell(2);
					Cell cell3 = tmpRow.getCell(3);
					Cell cell4 = tmpRow.getCell(4);
					Cell cell5 = tmpRow.getCell(5);
					Cell cell6 = tmpRow.getCell(6);
					Cell cell7 = tmpRow.getCell(7);
					Cell cell8 = tmpRow.getCell(8);
					Cell cell9 = tmpRow.getCell(9);
					Cell cell10 = tmpRow.getCell(10);
					Cell cell11 = tmpRow.getCell(11);
					Cell cell12 = tmpRow.getCell(12);
					Cell cell13 = tmpRow.getCell(13);
					Cell cell14 = tmpRow.getCell(14);
					Cell cell15 = tmpRow.getCell(15);
					if( k==1 && !needCreateStage(cell0,cell1)){
						System.out.println("指令不存在阶段");
					}
					if(needCreateStage(cell0,cell1)){
						stage = new Stage();
						stage.setStageNo(String.valueOf(getCellValue(cell0)));  //阶段序号
						stage.setStageName(isNull(cell1) ? "" : getCellValue(cell1)); //阶段名称
						stage.setStartTime(isNull(cell2) ? "" : excelTime(cell2)); //阶段开始时间
						stage.setEndTime(isNull(cell3) ? "" : excelTime(cell3)); //阶段完成时间
						stage.setProjectId(projectId);
						stage.setVersionId(versionId);
						System.out.println(stage);
						//stageRepository.save(stage);
						//stageId = stage.getId();
						//LOG.info(String.format("==创建阶段:[%s]==",stage.toString()));
					}

					if(needCreateCommand(cell4,cell5)){
						Command command = new Command();
						command.setProjectId(projectId);//项目ID
						command.setVersionId(versionId);//版本ID
						command.setStageId(stage.getId());//阶段ID
						command.setCommandNo(String.valueOf(getCellValue(cell4)));  //指令序号
						command.setTaskName(getCellValue(cell5)); //任务名称
						command.setPreTaskName(isNull(cell6) ? "" : getCellValue(cell6)); //前置任务名称
						command.setPostTaskName(isNull(cell7) ? "" : getCellValue(cell7)); //后续任务名称
						String costTime = getCellValue(cell8).replace("h","").replace(" ","");
						command.setCostTime(costTime); //工期
						command.setStartTime(isNull(cell9) ? "" : excelTime(cell9)); //计划开始时间
						command.setEndTime(isNull(cell10) ? "" : excelTime(cell10)); //计划完成时间
						command.setResponsibleTeam(isNull(cell11) ? "" : getCellValue(cell11)); //负责单位
						command.setExecuteUsers(isNull(cell12) ? "" : getCellValue(cell12)); //执行人
						command.setExecuteUsersMail(isNull(cell13) ? "" : getCellValue(cell13)); //执行人邮箱
						command.setSupervisors(isNull(cell14) ? "" : getCellValue(cell14)); //监督人
						command.setSupervisorsMail(isNull(cell15) ? "" : getCellValue(cell15)); //监督人邮箱
						//commandRepository.save(command);
						System.out.println(command);
						CommandStatus commandStatus = new CommandStatus();
						commandStatus.setCommandId(String.valueOf(command.getId()));
						commandStatus.setStatus(StatusConstants.CREATE);
						System.out.println(commandStatus);
						//LOG.info(String.format("==创建指令状态:[%s]==",commandStatus.toString()));
						//commandStatusRepository.save(commandStatus);
//                        String taskId = jobService.createScheduleJob(command);
//                        command.setCraneTaskId(taskId);
						//commandRepository.update(command);
						//LOG.info(String.format("==创建指令:[%s]==",command.toString()));
					}

				}
			}
		}
		} catch(Exception e){
			workbook.close();
			inputStream.close();
//			LOG.error("处理出错", ExceptionUtils.getStackTrace(e));
			throw new Exception("文本格式有问题，请检查！");
		}
		workbook.close();
		inputStream.close();
	}





	private String getCellValue(Cell cell) {
		String cellValue = "";
		DecimalFormat df = new DecimalFormat("#");
		switch (cell.getCellTypeEnum()) {
			case STRING:
				cellValue = cell.getRichStringCellValue().getString().trim();
				break;
			case NUMERIC:
				cellValue = df.format(cell.getNumericCellValue()).toString();
				break;
			case BOOLEAN:
				cellValue = String.valueOf(cell.getBooleanCellValue()).trim();
				break;
			case FORMULA:
				cellValue = cell.getCellFormula();
				break;
			default:
				cellValue = "";
		}
		return cellValue;
	}

	public String excelTime(Cell cell){
		String guarantee_time = null;
		if(DateUtil.isCellDateFormatted(cell)){
			//用于转化为日期格式
			Date d = cell.getDateCellValue();
			DateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			guarantee_time = formater.format(d);
		}
		return guarantee_time;
	}

	/**
	 * 如果这4个字段都存在则创建阶段
	 * @param cell0
	 * @param cell1
	 * @return
	 */
	private boolean needCreateStage(Cell cell0, Cell cell1){
		return !isNull(cell0) && !isNull(cell1) ;
	}

	private boolean needCreateCommand(Cell cell4, Cell cell5){
		return !isNull(cell4) && !isNull(cell5) ;
	}


	private boolean isNull(Cell cell) {
		return cell == null || getCellValue(cell).equals("");
	}
}
