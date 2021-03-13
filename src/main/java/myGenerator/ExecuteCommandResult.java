package myGenerator;

import java.time.LocalDateTime;

public class ExecuteCommandResult {
    private Integer id;

    private Integer commandId;

    private String operateUser;

    private LocalDateTime ackTime;

    private LocalDateTime beginTime;

    private LocalDateTime completeTime;

    private String isDelayed;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommandId() {
        return commandId;
    }

    public void setCommandId(Integer commandId) {
        this.commandId = commandId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser == null ? null : operateUser.trim();
    }

    public LocalDateTime getAckTime() {
        return ackTime;
    }

    public void setAckTime(LocalDateTime ackTime) {
        this.ackTime = ackTime;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(LocalDateTime completeTime) {
        this.completeTime = completeTime;
    }

    public String getIsDelayed() {
        return isDelayed;
    }

    public void setIsDelayed(String isDelayed) {
        this.isDelayed = isDelayed == null ? null : isDelayed.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}