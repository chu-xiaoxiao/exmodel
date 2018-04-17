package com.zyc.model;

import java.util.Date;

public class Subject {
    private Integer subjectid;

    private String subjectname;

    private Date startdate;

    private Date enddate;

    public Subject(Integer subjectid, String subjectname, Date startdate, Date enddate) {
        this.subjectid = subjectid;
        this.subjectname = subjectname;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Subject() {
        super();
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname == null ? null : subjectname.trim();
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