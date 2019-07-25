package com.course.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserListCase {
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public String getExpected() {
        return expected;
    }

    public int age;

    public int sex;

    public String expected;

}
