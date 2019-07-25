package com.course.model;




public class GetUserInfoCase {

    public int userid;

    public int getUserid() {
        return userid;
    }

    public String getExpected() {
        return expected;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String expected;
}
