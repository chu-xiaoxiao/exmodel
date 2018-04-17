package com.zyc.model;

import java.util.Date;

public class Usertopapertemp {
    private Integer usertopaperid;

    private Integer userid;

    private Integer paperid;

    private Double value;

    private Date startdate;

    private Date enddate;

    public Usertopapertemp(Integer usertopaperid, Integer userid, Integer paperid, Double value, Date startdate, Date enddate) {
        this.usertopaperid = usertopaperid;
        this.userid = userid;
        this.paperid = paperid;
        this.value = value;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Usertopapertemp() {
        super();
    }

    public Integer getUsertopaperid() {
        return usertopaperid;
    }

    public void setUsertopaperid(Integer usertopaperid) {
        this.usertopaperid = usertopaperid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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