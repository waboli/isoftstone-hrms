package com.isoftstone.hrms.model;

public class UserInfo {
    private String id;

    private String username;

    private String netName;

    private String job;

    private String familyNativePlace;

    private String mobile;

    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getFamilyNativePlace() {
        return familyNativePlace;
    }

    public void setFamilyNativePlace(String familyNativePlace) {
        this.familyNativePlace = familyNativePlace;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}