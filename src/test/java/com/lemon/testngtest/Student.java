package com.lemon.testngtest;

public class Student {
    private String username;
    private String password;
    private String type;
    private String sex;

    public Student() {
    }

    public Student(String username, String password, String type, String sex) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
