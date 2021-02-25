package myexcle;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2021-02-23 15:37
 * @description
 **/
public class StatusConstants {
	public static final String CREATE = "0"; //自动、人工创建
	public static final String ACK = "1";    //执行人或监督人操作ACK
	public static final String START = "2";  //执行人或监督人确认开始
	public static final String COMPLETE = "3"; //执行人或监督人确认指令完成
	public static final String NOTIFY = "4";   //指令被投放
}
