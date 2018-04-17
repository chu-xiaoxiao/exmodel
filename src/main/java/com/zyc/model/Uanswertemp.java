package com.zyc.model;

import java.util.Date;

public class Uanswertemp {
    private Integer doanswerid;

    private Integer paperid;

    private Integer userid;

    private Integer questionid;

    private String uanswer;

    private Date startdate;

    private Date enddate;

    public Uanswertemp(Integer doanswerid, Integer paperid, Integer userid, Integer questionid, String uanswer, Date startdate, Date enddate) {
        this.doanswerid = doanswerid;
        this.paperid = paperid;
        this.userid = userid;
        this.questionid = questionid;
        this.uanswer = uanswer;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Uanswertemp() {
        super();
    }

    public Integer getDoanswerid() {
        return doanswerid;
    }

    public void setDoanswerid(Integer doanswerid) {
        this.doanswerid = doanswerid;
    }

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getUanswer() {
        return uanswer;
    }

    public void setUanswer(String uanswer) {
        this.uanswer = uanswer == null ? null : uanswer.trim();
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