package com.zyc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
    private Integer menuid;

    private String menuname;

    private String path;

    private Integer power;

    private Integer parent;

    private List<Menu> childs;

    private Date startdate;

    public Menu(Integer menuid, String menuname, String path, Integer power, Integer parent, Date startdate) {
        this.menuid = menuid;
        this.menuname = menuname;
        this.path = path;
        this.power = power;
        this.parent = parent;
        this.startdate = startdate;
    }

    public Menu() {
        super();
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public List<Menu> getChilds() {
        return childs;
    }

    public void setChilds(List<Menu> childs) {
        this.childs = childs;
    }

    public void putChilds(Menu menu){
        if(this.childs==null){
            this.childs=new ArrayList<>();
        }
        this.childs.add(menu);
    }
}