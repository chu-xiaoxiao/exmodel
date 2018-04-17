package com.zyc.model;

import java.util.Date;

public class Question {
    private Integer questionid;

    private Integer questiontype;

    private Integer subjectid;

    private Date startdate;

    private Date enddate;

    private String answer;

    public Question(Integer questionid, Integer questiontype, Integer subjectid) {
        this.questionid = questionid;
        this.questiontype = questiontype;
        this.subjectid = subjectid;
    }

    public Question(Integer questionid, Integer questiontype, Integer subjectid, Date startdate, Date enddate) {
        this.questionid = questionid;
        this.questiontype = questiontype;
        this.subjectid = subjectid;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Question() {
        super();
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Integer getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(Integer questiontype) {
        this.questiontype = questiontype;
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}