package com.example.Model;

public class User {

    private String Name;
    private String PhNum;

    private String EmailId;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhNum() {
        return PhNum;
    }

    public void setPhNum(String phNum) {
        PhNum = phNum;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String emailId) {
        EmailId = emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", PhNum='" + PhNum + '\'' +
                ", EmailId='" + EmailId + '\'' +
                '}';
    }
}
