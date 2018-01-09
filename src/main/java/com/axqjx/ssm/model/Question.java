package com.axqjx.ssm.model;

/**
 * Created by zzz on 2018/1/8.
 */
public class Question {

    //问题编号
    private Integer QuestionId;
    //问题状态
    private Integer QuestionStatus;
    //问题概要
    private String QuestionMain;
    //问题详情
    private String QuestionDescribe;
    //问题解决方式
    private String QuestionResolve;
    //预留字段
    private String attr1;
    private String attr2;

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public Integer getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(Integer questionId) {
        QuestionId = questionId;
    }

    public Integer getQuestionStatus() {
        return QuestionStatus;
    }

    public void setQuestionStatus(Integer questionStatus) {
        QuestionStatus = questionStatus;
    }

    public String getQuestionMain() {
        return QuestionMain;
    }

    public void setQuestionMain(String questionMain) {
        QuestionMain = questionMain;
    }

    public String getQuestionDescribe() {
        return QuestionDescribe;
    }

    public void setQuestionDescribe(String questionDescribe) {
        QuestionDescribe = questionDescribe;
    }

    public String getQuestionResolve() {
        return QuestionResolve;
    }

    public void setQuestionResolve(String questionResolve) {
        QuestionResolve = questionResolve;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }
}

