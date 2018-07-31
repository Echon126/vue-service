package com.example.test.data;

public class VueUser {
    private String name;
    private String role;
    private String introduction;
    private String token;
    private String uid;

    public VueUser(String name, String role, String introduction, String token, String uid) {
        this.name = name;
        this.role = role;
        this.introduction = introduction;
        this.token = token;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
