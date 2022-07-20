package com.student.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long stuId;
    private String name;
    private String phone;


    List<Contact>  contact = new ArrayList();

    public Student() {
    }

    public Student(Long stuId, String name, String phone) {
        this.stuId = stuId;
        this.name = name;
        this.phone = phone;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public Student(Long stuId, String name, String phone, List<Contact> contact) {
        this.stuId = stuId;
        this.name = name;
        this.phone = phone;
        this.contact = contact;
    }
}
