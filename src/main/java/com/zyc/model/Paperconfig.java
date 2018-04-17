package com.zyc.model;

import java.util.Date;

public class Paperconfig {
    private Integer paperconfigid;

    private String papername;

    private Integer subjectid;

    private Integer scqnum;

    private Double scqvalue;

    private Integer mcqnum;

    private Double mcavalue;

    private Integer tfqnum;

    private Double tfqvalue;

    private Integer pqnum;

    private Double pqvalue;

    private Date startdate;

    private Date enddate;

    public Paperconfig(Integer paperconfigid, String papername, Integer subjectid, Integer scqnum, Double scqvalue, Integer mcqnum, Double mcavalue, Integer tfqnum, Double tfqvalue, Integer pqnum, Double pqvalue, Date startdate, Date enddate) {
        this.paperconfigid = paperconfigid;
        this.papername = papername;
        this.subjectid = subjectid;
        this.scqnum = scqnum;
        this.scqvalue = scqvalue;
        this.mcqnum = mcqnum;
        this.mcavalue = mcavalue;
        this.tfqnum = tfqnum;
        this.tfqvalue = tfqvalue;
        this.pqnum = pqnum;
        this.pqvalue = pqvalue;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Paperconfig() {
        super();
    }

    public Integer getPaperconfigid() {
        return paperconfigid;
    }

    public void setPaperconfigid(Integer paperconfigid) {
        this.paperconfigid = paperconfigid;
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername == null ? null : papername.trim();
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public Integer getScqnum() {
        return scqnum;
    }

    public void setScqnum(Integer scqnum) {
        this.scqnum = scqnum;
    }

    public Double getScqvalue() {
        return scqvalue;
    }

    public void setScqvalue(Double scqvalue) {
        this.scqvalue = scqvalue;
    }

    public Integer getMcqnum() {
        return mcqnum;
    }

    public void setMcqnum(Integer mcqnum) {
        this.mcqnum = mcqnum;
    }

    public Double getMcavalue() {
        return mcavalue;
    }

    public void setMcavalue(Double mcavalue) {
        this.mcavalue = mcavalue;
    }

    public Integer getTfqnum() {
        return tfqnum;
    }

    public void setTfqnum(Integer tfqnum) {
        this.tfqnum = tfqnum;
    }

    public Double getTfqvalue() {
        return tfqvalue;
    }

    public void setTfqvalue(Double tfqvalue) {
        this.tfqvalue = tfqvalue;
    }

    public Integer getPqnum() {
        return pqnum;
    }

    public void setPqnum(Integer pqnum) {
        this.pqnum = pqnum;
    }

    public Double getPqvalue() {
        return pqvalue;
    }

    public void setPqvalue(Double pqvalue) {
        this.pqvalue = pqvalue;
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