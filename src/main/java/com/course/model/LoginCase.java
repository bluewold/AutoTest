package com.course.model;





public class LoginCase {
    public int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getExpected() {
        return expected;
    }

    public String name;

    public String password;

     public String expected;

}
