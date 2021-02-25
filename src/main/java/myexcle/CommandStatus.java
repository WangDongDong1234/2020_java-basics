package myexcle;

/**
 * 指令状态
 */
public class CommandStatus {
    private Long id;

    /**
     * 关联指令唯一ID
     */
    private String commandId;

    /**
     * 指令实际开始时间
     */
    private String beginTime;

    /**
     * 指令实际完成时间
     */
    private String completeTime;

    /**
     * 指令是否delay
     */
    private String isDelayed;

    /**
     * 指令状态
     */
    private String status;

    /**
     * 操作人
     */
    private String operateUser;

    /**
     * 创建时间
     */
    private String createTime;

    public CommandStatus() {
    }

    public CommandStatus(Long id, String commandId, String beginTime, String completeTime, String isDelayed, String status, String operateUser, String createTime) {
        this.id = id;
        this.commandId = commandId;
        this.beginTime = beginTime;
        this.completeTime = completeTime;
        this.isDelayed = isDelayed;
        this.status = status;
        this.operateUser = operateUser;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "---CommandStatus{" +
                "id=" + id +
                ", commandId='" + commandId + '\'' +
                ", beginTime='" + beginTime + '\'' +
                ", completeTime='" + completeTime + '\'' +
                ", isDelayed='" + isDelayed + '\'' +
                ", status='" + status + '\'' +
                ", operateUser='" + operateUser + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommandId() {
        return commandId;
    }

    public void setCommandId(String commandId) {
        this.commandId = commandId;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public String getIsDelayed() {
        return isDelayed;
    }

    public void setIsDelayed(String isDelayed) {
        this.isDelayed = isDelayed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
