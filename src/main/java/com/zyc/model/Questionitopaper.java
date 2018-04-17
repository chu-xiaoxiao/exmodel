package com.zyc.model;

import java.util.Date;

public class Questionitopaper {
    private Integer questiontopaperid;

    private Integer paperid;

    private Integer questionid;

    private Double questionvalue;

    private Date startdate;

    private Date enddate;

    public Questionitopaper(Integer questiontopaperid, Integer paperid, Integer questionid, Double questionvalue, Date startdate, Date enddate) {
        this.questiontopaperid = questiontopaperid;
        this.paperid = paperid;
        this.questionid = questionid;
        this.questionvalue = questionvalue;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Questionitopaper() {
        super();
    }

    public Integer getQuestiontopaperid() {
        return questiontopaperid;
    }

    public void setQuestiontopaperid(Integer questiontopaperid) {
        this.questiontopaperid = questiontopaperid;
    }

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public Double getQuestionvalue() {
        return questionvalue;
    }

    public void setQuestionvalue(Double questionvalue) {
        this.questionvalue = questionvalue;
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
}