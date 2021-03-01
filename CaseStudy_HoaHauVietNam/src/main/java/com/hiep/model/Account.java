package com.hiep.model;

public class Account {
    private int idAccount;
    private String image;
    private String userName;
    private String passWord;
    private String fullName;
    private String email;
    private String status;

    public Account(int idAccount,String image, String userName, String passWord, String fullName, String email,  String status) {
        this.idAccount = idAccount;
        this.image = image;
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.email = email;
        this.status = status;
    }

    public Account(int idAccount, String image, String userName, String passWord, String fullName, String email) {
        this.idAccount = idAccount;
        this.image = image;
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.email = email;

    }

    public Account( String image,String userName, String passWord, String fullName, String email) {
        this.image = image;
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.email = email;

    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
