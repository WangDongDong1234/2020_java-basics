package myexcle;



public class Stage {
    private Long id;

    private Long projectId;

    private Long versionId;


    private String stageName;

    private String createTime;

    private String startTime;

    private String endTime;


    private String stageNo;

    public Stage() {
    }

    public Stage(Long id, Long projectId, Long versionId, String stageName, String createTime, String startTime, String endTime,String stageNo) {
        this.id = id;
        this.projectId = projectId;
        this.versionId = versionId;
        this.stageName = stageName;
        this.createTime = createTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.stageNo = stageNo;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", versionId=" + versionId +
                ", stageName='" + stageName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", stageNo='" + stageNo + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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

    public String getStageNo() {
        return stageNo;
    }

    public void setStageNo(String stageNo) {
        this.stageNo = stageNo;
    }
}
