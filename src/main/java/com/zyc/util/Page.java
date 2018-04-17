package com.zyc.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author YuChen Zhang
 *
 */
public class Page<T,E> implements Serializable {
    /**
     * 查询条件
     */
    private E e;
    private Integer currentPage;
    private Integer size;
    private Integer allPage = 0;
    private List<T> list = new ArrayList<>();
    private Integer start = 0;
    private Integer end = 0;
    private Long allRows = 0L;

    public Page() {

    }

    /**
     * 构造函数传入分页条件，当前页，页大小
     * @param e
     * @param currentPage
     * @param size
     */
    public Page(E e, Integer currentPage, Integer size) {
        super();
        this.e = e;
        if(currentPage!=null){
            this.currentPage = currentPage;
        }else{
            this.currentPage=0;
        }
        if(size!=null){
            this.size = size;
        }else{
            this.size=10;
        }
        this.allPage = allPage;
        this.list = list;
        this.start = this.size*this.currentPage;
        this.end =(this.size+1)*this.currentPage;
    }

    /**
     * 构造函数传入分页条件，当前页，页大小
     * 重载String类型
     * @param e
     * @param currentPage
     * @param size
     */
    public Page(E e, String currentPage, String size) {
        super();
        this.e = e;
        if(currentPage!=null){
            this.currentPage = Integer.parseInt(currentPage);
        }else{
            this.currentPage=0;
        }
        if(size!=null){
            this.size = Integer.parseInt(size);
        }else{
            this.size=10;
        }
        this.allPage = allPage;
        this.list = list;
        this.start = this.size*this.currentPage;
        this.end =(this.size+1)*this.currentPage;
    }

    /**
     * 获取分页起始
     * @return
     */
    public Integer getStart() {
        return start;
    }

    /**
     * 获取分页结束
     * @return
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * 获取查询Example类
     * @return
     */
    public E getE() {
        return e;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * 计算所有页同时保存所有行数
     * @param allRows
     */
    public void countAllPage(Integer allRows) {
        this.allRows = allRows.longValue();
        this.allPage =  (allRows+this.size-1)/this.size;
    }
    /**
     * 计算所有页同时保存所有行数
     * 重载Long
     * @param allRows
     */
    public void countAllPage(Long allRows) {
        this.allRows = allRows;
        this.allPage = Math.toIntExact((allRows + this.size - 1) / this.size);
    }

    /**
     * 获取页大小
     * @return
     */
    public Integer getSize() {
        return size;
    }


    public void setE(E e) {
        this.e = e;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getAllPage() {
        return allPage;
    }

    public void setAllPage(Integer allPage) {
        this.allPage = allPage;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Long getAllRows() {
        return allRows;
    }

    public void setAllRows(Long allRows) {
        this.allRows = allRows;
    }
}
