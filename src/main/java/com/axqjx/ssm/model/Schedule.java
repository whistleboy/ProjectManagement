package com.axqjx.ssm.model;

import java.util.Date;

/**
 * Created by zzz on 2018/1/8.
 */
public class Schedule {

    //日程日期
    private Date scheduleDate;
    //用户编号
    private Integer userId;
    //项目编号
    private Integer projectId;
    //实施编号
    private Integer implementId;
    //日程备注
    private String scheduleNote;
    //预留字段
    private String attr1;
    private String attr2;

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getScheduleNote() {
        return scheduleNote;
    }

    public void setScheduleNote(String scheduleNote) {
        this.scheduleNote = scheduleNote;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }
}
