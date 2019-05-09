package com.example.ToDo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


import java.util.Date;

@Component
public class ToDo {

    private int id;
    private String user;
    private String desc;
    private String targetDate;
    private boolean isDone;

    public ToDo (){

    }

    public ToDo(int id, String user, String desc, String targetDate, boolean isDone){
        super();
        this.id = id;
        this.desc = desc;
        this.isDone = isDone;
        this.targetDate = targetDate;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    public boolean getisDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", desc='" + desc + '\'' +
                ", targetDate=" + targetDate +
                ", isDone=" + isDone +
                '}';
    }
}
