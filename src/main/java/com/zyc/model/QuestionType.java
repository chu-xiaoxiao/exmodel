package com.zyc.model;

/**
 * Created by YuChen Zhang on 18/02/02.
 */
public enum QuestionType {

    SCQ("单选题",1),
    MCQ("多选题",2),
    TFQ("判断题",3),
    PQ("编程题",4);

    private String name;
    private Integer index;

    QuestionType(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public Integer getIndex() {
        return index;
    }
}
