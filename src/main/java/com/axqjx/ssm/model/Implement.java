package com.axqjx.ssm.model;

/**
 * Created by zzz on 2018/1/8.
 */
public class Implement {

    //实施编号
    private Integer implementId;
    //项目编号
    private Integer projectId;
    //实施状态
    private Integer implementStatus;
    //是否需要协助
    private boolean isHelp;
    //实施主要负责人编号
    private Integer implementMainId;
    //实施协同人
    private Integer implementHelpId;
    //实施问题编号
    private Integer implementQuestionId;
    //实施备注
    private Integer implementNote;
    //预留字段
    private String attr1;
    private String attr2;

    public Integer getImplementId() {
        return implementId;
    }

    public void setImplementId(Integer implementId) {
        this.implementId = implementId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getImplementStatus() {
        return implementStatus;
    }

    public void setImplementStatus(Integer implementStatus) {
        this.implementStatus = implementStatus;
    }

    public Integer getImplementMainId() {
        return implementMainId;
    }

    public void setImplementMainId(Integer implementMainId) {
        this.implementMainId = implementMainId;
    }

    public Integer getImplementHelpId() {
        return implementHelpId;
    }

    public void setImplementHelpId(Integer implementHelpId) {
        this.implementHelpId = implementHelpId;
    }

    public Integer getImplementQuestionId() {
        return implementQuestionId;
    }

    public void setImplementQuestionId(Integer implementQuestionId) {
        this.implementQuestionId = implementQuestionId;
    }

    public Integer getImplementNote() {
        return implementNote;
    }

    public void setImplementNote(Integer implementNote) {
        this.implementNote = implementNote;
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

    public boolean isHelp() {
        return isHelp;
    }

    public void setHelp(boolean isHelp) {
        this.isHelp = isHelp;
    }
}
