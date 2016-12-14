package hello.domain;

import java.util.Date;

/**
 * Created by guojing on 2016/12/14.
 */
public class FollowupDomain {
    private Long id;
    private int category;
    private int codex;
    private String content;
    private int staffId;
    private int studentId;
    private int nextContactTime;
    private Date createTime;
    private Date updateTime;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getCodex() {
        return codex;
    }

    public void setCodex(int codex) {
        this.codex = codex;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNextContactTime() {
        return nextContactTime;
    }

    public void setNextContactTime(int nextContactTime) {
        this.nextContactTime = nextContactTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
