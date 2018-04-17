package com.zyc.model;

import java.util.Date;

public class Scq extends Question {
    private Integer scqid;

    private String scqtext;

    private String answera;

    private String answerb;

    private String answerc;

    private String answerd;

    private String answer;

    private Date startdate;

    private Date enddate;

    public Scq(Integer scqid, Integer questiontype, Integer subjectid, String scqtext, String answera, String answerb, String answerc, String answerd, String answer, Date startdate, Date enddate) {
        super(scqid,questiontype, subjectid);
        this.scqid = scqid;
        this.scqtext = scqtext;
        this.answera = answera;
        this.answerb = answerb;
        this.answerc = answerc;
        this.answerd = answerd;
        this.answer = answer;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Scq(Integer scqid, String scqtext, String answera, String answerb, String answerc, String answerd, String answer, Date startdate, Date enddate) {
        this.scqid = scqid;
        this.scqtext = scqtext;
        this.answera = answera;
        this.answerb = answerb;
        this.answerc = answerc;
        this.answerd = answerd;
        this.answer = answer;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Scq() {
        super();
    }

    public Integer getScqid() {
        return scqid;
    }

    public void setScqid(Integer scqid) {
        this.scqid = scqid;
    }

    public String getScqtext() {
        return scqtext;
    }

    public void setScqtext(String scqtext) {
        this.scqtext = scqtext == null ? null : scqtext.trim();
    }

    public String getAnswera() {
        return answera;
    }

    public void setAnswera(String answera) {
        this.answera = answera == null ? null : answera.trim();
    }

    public String getAnswerb() {
        return answerb;
    }

    public void setAnswerb(String answerb) {
        this.answerb = answerb == null ? null : answerb.trim();
    }

    public String getAnswerc() {
        return answerc;
    }

    public void setAnswerc(String answerc) {
        this.answerc = answerc == null ? null : answerc.trim();
    }

    public String getAnswerd() {
        return answerd;
    }

    public void setAnswerd(String answerd) {
        this.answerd = answerd == null ? null : answerd.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
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