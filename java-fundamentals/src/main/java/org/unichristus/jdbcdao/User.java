package org.unichristus.jdbcdao;

import java.util.Calendar;

public class User {
    private long id;
    private String name;
    private String email;
    private String address;
    private Calendar createDate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public Calendar getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Calendar createDate) {
        this.createDate = createDate;
    }
}
