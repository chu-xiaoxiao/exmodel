package com.zyc.model;

import java.util.Date;

public class Pq extends Question {
    private Integer pqid;

    private String pqtext;

    private String pqanswer;

    private String pqpath;

    private Date startdate;

    private Date enddate;

    public Pq(Integer pqid,Integer questiontype, Integer subjectid,  String pqtext, String pqanswer, String pqpath, Date startdate, Date enddate) {
        super(pqid,questiontype, subjectid);
        this.pqid = pqid;
        this.pqtext = pqtext;
        this.pqanswer = pqanswer;
        this.pqpath = pqpath;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Pq(Integer pqid, String pqtext, String pqanswer, String pqpath, Date startdate, Date enddate) {
        this.pqid = pqid;
        this.pqtext = pqtext;
        this.pqanswer = pqanswer;
        this.pqpath = pqpath;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Pq() {
        super();
    }

    public Integer getPqid() {
        return pqid;
    }

    public void setPqid(Integer pqid) {
        this.pqid = pqid;
    }

    public String getPqtext() {
        return pqtext;
    }

    public void setPqtext(String pqtext) {
        this.pqtext = pqtext == null ? null : pqtext.trim();
    }

    public String getPqanswer() {
        return pqanswer;
    }

    public void setPqanswer(String pqanswer) {
        this.pqanswer = pqanswer == null ? null : pqanswer.trim();
    }

    public String getPqpath() {
        return pqpath;
    }

    public void setPqpath(String pqpath) {
        this.pqpath = pqpath == null ? null : pqpath.trim();
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