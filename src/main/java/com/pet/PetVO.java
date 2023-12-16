package com.pet;

import java.util.Date;

public class PetVO {
    private int seq;
    private String mname;
    private String pname;
    private String picture;
    private String kind;
    private String pnumber;
    private String comeday;
    private String byeday;
    private Date regdate;
    private String contents;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getComeday() {
        return comeday;
    }

    public void setComeday(String comeday) {
        this.comeday = comeday;
    }

    public String getByeday() {
        return byeday;
    }

    public void setByeday(String byeday) {
        this.byeday = byeday;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
