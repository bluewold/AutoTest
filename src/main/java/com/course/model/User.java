package com.course.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    public int id;

    public String name;

    public String password;

    public int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
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

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public int getPermission() {
        return permission;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public int sex;

    public int permission;

    public int isDelete;

    @Override
    public String toString(){
        return "id:"+id+" name:"+name;
    }
}
