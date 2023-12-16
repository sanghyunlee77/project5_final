package com.board;

import java.sql.Timestamp;

public class BoardVO {
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    private int seq;
    private String mname;
    private String fname;
    private String picture;
    private String kind;
    private String pnumber;
    private String comeday;
    private String byeday;
    private java.sql.Timestamp regdate;
    private String contents;



    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getByeday() {
        return byeday;
    }

    public void setByeday(String byeday) {
        this.byeday = byeday;
    }

    public String getComeday() {
        return comeday;
    }

    public void setComeday(String comeday) {
        this.comeday = comeday;
    }

    public Timestamp getRegdate() {
        return regdate;
    }



    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setRegdate(java.sql.Timestamp regdate) {
        this.regdate = regdate;
    }
}