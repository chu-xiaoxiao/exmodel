package com.zyc.model;

import java.util.Date;

public class Mcq extends Question {
    private Integer mcqid;

    private String mcqtext;

    private String answera;

    private String answerb;

    private String answerc;

    private String answerd;

    private String answer;

    private Date startdate;

    private Date enddate;

    public Mcq(Integer mcqid, Integer questiontype, Integer subjectid, String mcqtext, String answera, String answerb, String answerc, String answerd, String answer, Date startdate, Date enddate) {
        super(mcqid,questiontype, subjectid);
        this.mcqid = mcqid;
        this.mcqtext = mcqtext;
        this.answera = answera;
        this.answerb = answerb;
        this.answerc = answerc;
        this.answerd = answerd;
        this.answer = answer;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Mcq(Integer mcqid, String mcqtext, String answera, String answerb, String answerc, String answerd, String answer, Date startdate, Date enddate) {
        this.mcqid = mcqid;
        this.mcqtext = mcqtext;
        this.answera = answera;
        this.answerb = answerb;
        this.answerc = answerc;
        this.answerd = answerd;
        this.answer = answer;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Mcq() {
        super();
    }

    public Integer getMcqid() {
        return mcqid;
    }

    public void setMcqid(Integer mcqid) {
        this.mcqid = mcqid;
    }

    public String getMcqtext() {
        return mcqtext;
    }

    public void setMcqtext(String mcqtext) {
        this.mcqtext = mcqtext == null ? null : mcqtext.trim();
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