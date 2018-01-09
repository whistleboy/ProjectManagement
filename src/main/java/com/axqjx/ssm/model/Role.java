package com.axqjx.ssm.model;

/**
 * Created by zzz on 2018/1/8.
 */
public class Role {

    //角色编号
    private Integer roleId;
    //角色名称
    private String roleName;
    //预留字段
    private String attr1;
    private String attr2;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
