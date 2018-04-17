package com.zyc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paper {
    private Integer paperid;

    private Integer papertype;

    private Integer createuser;

    private Date startdate;

    private Date enddate;

    private Paperconfig paperconfig;

    private List<Question> questions;

    private List<Scq> scqs;
    private List<Mcq> mcqs;
    private List<Tfq> tfqs;
    private List<Pq>pqs;

    public Paper(Integer paperid, Integer papertype, Integer createuser, Date startdate, Date enddate) {
        this.paperid = paperid;
        this.papertype = papertype;
        this.createuser = createuser;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Paper() {
        super();
    }

    public Integer getPaperid() {
        return paperid;
    }

    public void setPaperid(Integer paperid) {
        this.paperid = paperid;
    }

    public Integer getPapertype() {
        return papertype;
    }

    public void setPapertype(Integer papertype) {
        this.papertype = papertype;
    }

    public Integer getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
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

    public Paperconfig getPaperconfig() {
        return paperconfig;
    }

    public void setPaperconfig(Paperconfig paperconfig) {
        this.paperconfig = paperconfig;
    }

    public List<Question> getQuestions() {
        if(questions==null){
            questions = new ArrayList<>();
        }
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Scq> getScqs() {
        return scqs;
    }

    public void setScqs(List<Scq> scqs) {
        this.scqs = scqs;
    }

    public List<Mcq> getMcqs() {
        return mcqs;
    }

    public void setMcqs(List<Mcq> mcqs) {
        this.mcqs = mcqs;
    }

    public List<Tfq> getTfqs() {
        return tfqs;
    }

    public void setTfqs(List<Tfq> tfqs) {
        this.tfqs = tfqs;
    }

    public List<Pq> getPqs() {
        return pqs;
    }

    public void setPqs(List<Pq> pqs) {
        this.pqs = pqs;
    }
    public void addQuestion(Question question){
        if(this.getPqs()==null){
            pqs = new ArrayList<>();
        }
        if(this.getMcqs()==null){
            mcqs = new ArrayList<>();
        }
        if(this.getScqs()==null){
            scqs = new ArrayList<>();
        }
        if(this.getTfqs()==null){
            tfqs = new ArrayList<>();
        }
        switch (question.getQuestiontype()){
            case 1:
                pqs.add((Pq) question);
                break;
            case 2:
                mcqs.add((Mcq) question);
                break;
            case 3:
                scqs.add((Scq) question);
                break;
            case 4:
                tfqs.add((Tfq) question);
                break;
        }
    }
}