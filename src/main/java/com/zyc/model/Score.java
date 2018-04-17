package com.zyc.model;

import java.util.Date;

public class Score {
    private Integer scoreid;

    private Integer paperid;

    private Integer userid;

    private Double score;

    private Date startdate;

    private Date enddate;

    public Score(Integer scoreid, Integer paperid, Integer userid, Double score, Date startdate, Date enddate) {
        this.scoreid = scoreid;
        this.paperid = paperid;
        this.userid = userid;
        this.score = score;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Score() {
        super();
    }

    public Integer getScoreid() {
        return scoreid;
    }

    public void setScoreid(Integer scoreid) {
        this.scoreid = scoreid;
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

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
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