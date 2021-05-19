package myexcle;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-04-23 15:21
 * @description  “excel中xls和xlsx的区别是：1、xls是复合文档类型的结构，而xlsx的核心结构是XML类型的结构；
 *                                       2、xls是excel2003及以前版本生成的文件格式，而xlsx是excel2007及以后版本生成的文件格式。”
 **/
public class ResolveExcleUtils {

	public static void resolve(Long projectId, Long versionId,String excelFileName) throws Exception {
		File excel = new File(excelFileName);
		//1.判断该地址是不是一个文件
		if(!excel.isFile()){
			throw new Exception("指定地址下不存在这个文件");
		}
		String[] split = excel.getName().split("\\.");
		Workbook wb = null;
		FileInputStream inputStream = new FileInputStream(excel);
		//2.根据文件后缀创建对应的对象
		if("xls".equals(split[1])){
			wb = new HSSFWorkbook(inputStream);
		}else if("xlsx".equals(split[1])){
			wb = new XSSFWorkbook(inputStream);
		}else{
			throw new Exception("文件格式不正确不正确，上传文件格式只支持xls,xlsx");
		}
		//3.取第一个sheet
		Sheet sheet = wb.getSheetAt(0);
		//行从0开始，0对应excle实际显示的1，依次往后（第一行是列名，所以不读）
		//int firstRowIndex = sheet.getFirstRowNum()+1;
		//总共多少行，行数从1开始
		int total = sheet.getLastRowNum()+1;
		//4.封装数据
		//4.1如果行数等于1，说明存在需要录入的指令
		try{
			if(total>1){
				Stage tmpStage = null;
				Row tmpRow =null;
				for(int i=1;i<=total;i++){
					tmpRow = sheet.getRow(i);
					if(tmpRow!=null){
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
						if( i==1 && !needCreateStage(cell0,cell1)){
							throw new Exception("第一条指令必须存在阶段,阶段序号和阶段名称必须同时存在");
						}
						//创建阶段属性校验
						if(needCreateStage(cell0,cell1)){
							tmpStage = new Stage();
							if(isNull(cell0)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(1)+"列数据不符合规范，原因是阶段序号不能为空");
							}
							//阶段序号
							tmpStage.setStageNo(String.valueOf(getCellValue(cell0)));
							if(isNull(cell1)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(2)+"列数据不符合规范，原因是阶段名称不能为空");
							}
							////阶段名称
							tmpStage.setStageName(isNull(cell1) ? "" : getCellValue(cell1));
							if(isNull(cell2)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(3)+"列数据不符合规范，原因是阶段开始时间不能为空");
							}
							if(!DateUtil.isCellDateFormatted(cell2)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(3)+"列数据不符合规范，原因是阶段开始时间格式错误");
							}
							//阶段开始时间
							tmpStage.setStartTime(excelTime(cell2));
							if(isNull(cell3)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(4)+"列数据不符合规范，原因是阶段完成时间不能为空");
							}
							if(!DateUtil.isCellDateFormatted(cell3)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(4)+"列数据不符合规范，原因是阶段完成时间格式错误");
							}
							//阶段完成时间
							tmpStage.setEndTime(isNull(cell3) ? "" : excelTime(cell3)); //阶段完成时间
							tmpStage.setProjectId(projectId);
							tmpStage.setVersionId(versionId);
							System.out.println(tmpStage);
						}
						//创建指令(指令序号和指令名称存在就穿件指令)
						if(needCreateCommand(cell4,cell5)){
							Command command = new Command();
							command.setProjectId(projectId);//项目ID
							command.setVersionId(versionId);//版本ID
							command.setStageId(tmpStage.getId());//阶段ID
							command.setStageName(tmpStage.getStageName());//阶段名称
							if(isNull(cell4)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(5)+"列数据不符合规范，原因是指令序号不能为空");
							}
							//指令序号
							command.setCommandNo(String.valueOf(getCellValue(cell4)));
							if(isNull(cell5)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(6)+"列数据不符合规范，原因是指令名称不能为空");
							}
							//任务名称
							command.setTaskName(getCellValue(cell5));
							//前置任务名称
							command.setPreTaskName(isNull(cell6) ? "" : getCellValue(cell6));
							//后续任务名称
							command.setPostTaskName(isNull(cell7) ? "" : getCellValue(cell7));
							if(isNull(cell8)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(9)+"列数据不符合规范，原因是工时不能为空");
							}
							String costTime = getCellValue(cell8).replace("h","").replace(" ","");
							//工期
							command.setCostTime(costTime);
							if(isNull(cell9)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(10)+"列数据不符合规范，原因是指令开始时间不能为空");
							}
							if(!DateUtil.isCellDateFormatted(cell9)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(10)+"列数据不符合规范，原因是指令开始时间格式错误");
							}
							//计划开始时间
							command.setStartTime(isNull(cell9) ? "" : excelTime(cell9));
							if(isNull(cell10)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(11)+"列数据不符合规范，原因是指令开始结束不能为空");
							}
							if(!DateUtil.isCellDateFormatted(cell10)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(11)+"列数据不符合规范，原因是指令结束时间格式错误");
							}
							//计划完成时间
							command.setEndTime(isNull(cell10) ? "" : excelTime(cell10));
							//负责单位
							command.setResponsibleTeam(isNull(cell11) ? "" : getCellValue(cell11));
							if(isNull(cell12)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(13)+"列数据不符合规范，执行人不能为空");
							}
							//执行人
							command.setExecuteUsers(isNull(cell12) ? "" : getCellValue(cell12));
							if(isNull(cell13)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(14)+"列数据不符合规范，执行人邮箱不能为空");
							}
							//执行人邮箱
							command.setExecuteUsersMail(isNull(cell13) ? "" : getCellValue(cell13));
							if(isNull(cell14)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(15)+"列数据不符合规范，监督人不能为空");
							}
							//监督人
							command.setSupervisors(isNull(cell14) ? "" : getCellValue(cell14));
							if(isNull(cell15)){
								throw new Exception("第"+i+"行,第"+excelColIndexToStr(16)+"列数据不符合规范，监督人邮箱不能为空");
							}
							//监督人邮箱
							command.setSupervisorsMail(isNull(cell15) ? "" : getCellValue(cell15));
							System.out.println(command);


						}
					}
				}

			}
		}catch (Exception e){
			System.out.println(e.getMessage());
			throw new Exception(e);

		}finally {
			wb.close();
			inputStream.close();
		}



	}


	public static String getCellValue(Cell cell) {
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

	public static String excelTime(Cell cell){
		String guarantee_time = null;
		//用于转化为日期格式
		Date d = cell.getDateCellValue();
		DateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		guarantee_time = formater.format(d);
		return guarantee_time;
	}

	/**
	 * 如果这4个字段都存在则创建阶段
	 * @param cell0
	 * @param cell1
	 * @return
	 */
	public static boolean needCreateStage(Cell cell0, Cell cell1){
		return !isNull(cell0) && !isNull(cell1) ;
	}

	public static boolean needCreateCommand(Cell cell4, Cell cell5){
		return !isNull(cell4) && !isNull(cell5) ;
	}


	public static boolean isNull(Cell cell) {
		return cell == null || getCellValue(cell).equals("");
	}

	public static void main(String[] args) throws Exception {
		ResolveExcleUtils.resolve(1L,1L,"/Users/wangdongdong/Documents/ownCode/2020_java-basics/src/main/java/myexcle/CommandModule_biaozhun (5).xlsx");
//		String colstr = "AA";
//		int colIndex = excelColStrToNum(colstr, colstr.length());
//		System.out.println("'" + colstr + "' column index of " + colIndex);
//
//		colIndex = 1;
//		colstr = excelColIndexToStr(colIndex);
//		System.out.println(colIndex + " column in excel of " + colstr);
//
//		colstr = "AAAA";
//		colIndex = excelColStrToNum(colstr, colstr.length());
//		System.out.println("'" + colstr + "' column index of " + colIndex);
//
//		colIndex = 466948;
//		colstr = excelColIndexToStr(colIndex);
//		System.out.println(colIndex + " column in excel of " + colstr);
	}


	/**
	 * Excel column index begin 1
	 * @param colStr
	 * @param length
	 * @return
	 */
	public static int excelColStrToNum(String colStr, int length) {
		int num = 0;
		int result = 0;
		for(int i = 0; i < length; i++) {
			char ch = colStr.charAt(length - i - 1);
			num = (int)(ch - 'A' + 1) ;
			num *= Math.pow(26, i);
			result += num;
		}
		return result;
	}

	/**
	 * Excel column index begin 1
	 * @param columnIndex
	 * @return
	 */
	public static String excelColIndexToStr(int columnIndex) {
		if (columnIndex <= 0) {
			return null;
		}
		String columnStr = "";
		columnIndex--;
		do {
			if (columnStr.length() > 0) {
				columnIndex--;
			}
			columnStr = ((char) (columnIndex % 26 + (int) 'A')) + columnStr;
			columnIndex = (int) ((columnIndex - columnIndex % 26) / 26);
		} while (columnIndex > 0);
		return columnStr;
	}
}
