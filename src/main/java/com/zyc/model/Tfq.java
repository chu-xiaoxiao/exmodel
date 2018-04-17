package com.zyc.model;

import java.util.Date;

public class Tfq extends Question {
    private Integer tfqid;

    private String tfqtext;

    private Boolean tfqanswer;

    private Date startdate;

    private Date enddate;

    public Tfq(Integer tfqid, Integer questiontype, Integer subjectid, String tfqtext, Boolean tfqanswer, Date startdate, Date enddate) {
        super(tfqid,questiontype, subjectid);
        this.tfqid = tfqid;
        this.tfqtext = tfqtext;
        this.tfqanswer = tfqanswer;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Tfq(Integer tfqid, String tfqtext, Boolean tfqanswer, Date startdate, Date enddate) {
        this.tfqid = tfqid;
        this.tfqtext = tfqtext;
        this.tfqanswer = tfqanswer;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Tfq() {
        super();
    }

    public Integer getTfqid() {
        return tfqid;
    }

    public void setTfqid(Integer tfqid) {
        this.tfqid = tfqid;
    }

    public String getTfqtext() {
        return tfqtext;
    }

    public void setTfqtext(String tfqtext) {
        this.tfqtext = tfqtext == null ? null : tfqtext.trim();
    }

    public Boolean getTfqanswer() {
        return tfqanswer;
    }

    public void setTfqanswer(Boolean tfqanswer) {
        this.tfqanswer = tfqanswer;
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