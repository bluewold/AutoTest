package com.course.model;

import com.fasterxml.jackson.annotation.JsonProperty;



public class AddUserCase {
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getPermission() {
        return permission;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public String getExpected() {
        return expected;
    }

    public int id;
    public int getId(){
        return id;
    }
    public void setId(int value){
        id = value;
    }
    public String name;

    public String password;

    public int  sex;

    public int age;

    public int permission;

    public int isDelete;

    public String expected;
}
