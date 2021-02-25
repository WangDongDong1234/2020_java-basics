package myexcle;



/**
 * 指令
 */
public class Command {

    private Long id;

    /**
     * 项目唯一id
     */
    private Long projectId;

    /**
     * 版本唯一id
     */
    private Long versionId;

    /**
     * 阶段唯一id
     */
    private Long stageId;

    /**
     * 阶段名
     */
    private String stageName;

    /**
     * 指令序号
     */
    private String commandNo;


    private String taskName;

    /**
     * 前置任务指令序号
     */
    private String preTaskName;

    /**
     * 后置任务指令序号
     */
    private String postTaskName;

    /**
     * 工时
     */
    private String costTime;

    /**
     * 预计开始时间
     */
    private String startTime;

    /**
     * 预计结束时间
     */
    private String endTime;

    /**
     * 负责团队
     */
    private String responsibleTeam;

    /**
     * 执行人
     */
    private String executeUsers;

    /**
     * 执行人MIS
     */
    private String executeUsersMail;

    /**
     * 监督人
     */
    private String supervisors;

    /**
     * 监督人MIS
     */
    private String supervisorsMail;

    /**
     * 指令对应Crane任务的ID
     */
    private String craneTaskId;

    /**
     * 指令状态
     */
    private String status;

    public Command() {
    }

    public Command(Long id, Long projectId, Long versionId, Long stageId, String commandNo,
            String taskName, String preTaskName, String postTaskName, String costTime, String startTime, String endTime,
				   String responsibleTeam,String executeUsers,
				   String executeUsersMail,  String supervisors,
				    String supervisorsMail, String craneTaskId, String stageName, String status) {
        this.id = id;
        this.projectId = projectId;
        this.versionId = versionId;
        this.stageId = stageId;
        this.stageName = stageName;
        this.commandNo = commandNo;
        this.taskName = taskName;
        this.preTaskName = preTaskName;
        this.postTaskName = postTaskName;
        this.costTime = costTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.responsibleTeam = responsibleTeam;
        this.executeUsers = executeUsers;
        this.executeUsersMail = executeUsersMail;
        this.supervisors = supervisors;
        this.supervisorsMail = supervisorsMail;
        this.craneTaskId = craneTaskId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "--Command{" +
                "id:" + id +
                ", projectId:" + projectId +
                ", versionId:" + versionId +
                ", stageId:" + stageId +
                ", stageName:'" + stageName + '\'' +
                ", commandNo:'" + commandNo + '\'' +
                ", taskName:'" + taskName + '\'' +
                ", preTaskName:'" + preTaskName + '\'' +
                ", postTaskName:'" + postTaskName + '\'' +
                ", costTime:'" + costTime + '\'' +
                ", startTime:'" + startTime + '\'' +
                ", endTime:'" + endTime + '\'' +
                ", responsibleTeam:'" + responsibleTeam + '\'' +
                ", executeUsers:'" + executeUsers + '\'' +
                ", executeUsersMail:'" + executeUsersMail + '\'' +
                ", supervisors:'" + supervisors + '\'' +
                ", supervisorsMail:'" + supervisorsMail + '\'' +
                ", craneTaskId:'" + craneTaskId + '\'' +
                ", status:'" + status + '\'' +
                '}';
    }

    public Long getStageId() {
        return stageId;
    }

    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public String getCommandNo() {
        return commandNo;
    }

    public void setCommandNo(String commandNo) {
        this.commandNo = commandNo;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPreTaskName() {
        return preTaskName;
    }

    public void setPreTaskName(String preTaskName) {
        this.preTaskName = preTaskName;
    }

    public String getPostTaskName() {
        return postTaskName;
    }

    public void setPostTaskName(String postTaskName) {
        this.postTaskName = postTaskName;
    }

    public String getCostTime() {
        return costTime;
    }

    public void setCostTime(String costTime) {
        this.costTime = costTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getResponsibleTeam() {
        return responsibleTeam;
    }

    public void setResponsibleTeam(String responsibleTeam) {
        this.responsibleTeam = responsibleTeam;
    }

    public String getExecuteUsers() {
        return executeUsers;
    }

    public void setExecuteUsers(String executeUsers) {
        this.executeUsers = executeUsers;
    }

    public String getSupervisors() {
        return supervisors;
    }

    public void setSupervisors(String supervisors) {
        this.supervisors = supervisors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCraneTaskId() {
        return craneTaskId;
    }

    public void setCraneTaskId(String craneTaskId) {
        this.craneTaskId = craneTaskId;
    }

    public String getExecuteUsersMail() {
        return executeUsersMail;
    }

    public void setExecuteUsersMail(String executeUsersMail) {
        this.executeUsersMail = executeUsersMail;
    }

    public String getSupervisorsMail() {
        return supervisorsMail;
    }

    public void setSupervisorsMail(String supervisorsMail) {
        this.supervisorsMail = supervisorsMail;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
