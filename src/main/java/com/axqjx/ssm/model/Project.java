package com.axqjx.ssm.model;

import java.util.Date;

/**
 * Created by zzz on 2018/1/8.
 */
public class Project {

    //项目编号
    private Integer projectId;
    //项目名称
    private String projectName;
    //项目版本
    private String projectVersion;
    //项目部署地址
    private String projectAddress;
    //项目详情
    private String projectDetail;
    //项目状态
    private Integer projectStatus;
    //项目经理编号
    private Integer projectManagerId;
    //项目实施人员编号
    private Integer projectImplementId;
    //项目实施开始日期
    private Date projectDateFrom;
    //项目实施结束日期
    private Date projectDateTo;
    //项目携带资产编号
    private Integer projectAssetId;
    //预留字段
    private String attr1;
    private String attr2;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public String getProjectDetail() {
        return projectDetail;
    }

    public void setProjectDetail(String projectDetail) {
        this.projectDetail = projectDetail;
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Integer getProjectManagerId() {
        return projectManagerId;
    }

    public void setProjectManagerId(Integer projectManagerId) {
        this.projectManagerId = projectManagerId;
    }

    public Integer getProjectImplementId() {
        return projectImplementId;
    }

    public void setProjectImplementId(Integer projectImplementId) {
        this.projectImplementId = projectImplementId;
    }

    public Date getProjectDateFrom() {
        return projectDateFrom;
    }

    public void setProjectDateFrom(Date projectDateFrom) {
        this.projectDateFrom = projectDateFrom;
    }

    public Date getProjectDateTo() {
        return projectDateTo;
    }

    public void setProjectDateTo(Date projectDateTo) {
        this.projectDateTo = projectDateTo;
    }

    public Integer getProjectAssetId() {
        return projectAssetId;
    }

    public void setProjectAssetId(Integer projectAssetId) {
        this.projectAssetId = projectAssetId;
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
