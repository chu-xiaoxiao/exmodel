package com.zyc.model;

import java.util.Date;

public class Filterpath {
    private Integer filterid;

    private String filterpath;

    private String filterauthority;

    private String filterrole;

    private Date startdate;

    private Date enddate;

    public Filterpath(Integer filterid, String filterpath, String filterauthority, String filterrole, Date startdate, Date enddate) {
        this.filterid = filterid;
        this.filterpath = filterpath;
        this.filterauthority = filterauthority;
        this.filterrole = filterrole;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Filterpath() {
        super();
    }

    public Integer getFilterid() {
        return filterid;
    }

    public void setFilterid(Integer filterid) {
        this.filterid = filterid;
    }

    public String getFilterpath() {
        return filterpath;
    }

    public void setFilterpath(String filterpath) {
        this.filterpath = filterpath == null ? null : filterpath.trim();
    }

    public String getFilterauthority() {
        return filterauthority;
    }

    public void setFilterauthority(String filterauthority) {
        this.filterauthority = filterauthority == null ? null : filterauthority.trim();
    }

    public String getFilterrole() {
        return filterrole;
    }

    public void setFilterrole(String filterrole) {
        this.filterrole = filterrole == null ? null : filterrole.trim();
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