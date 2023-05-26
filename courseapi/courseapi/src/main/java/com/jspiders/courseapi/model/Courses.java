package com.jspiders.courseapi.model;

public class Courses
{
    private int batchCode;
    private String subject;
    private String faculty;
    private  int totalClasses;

    public Courses() {
    }

    public Courses(int batchCode, String subject, String faculty, int totalClasses) {
        this.batchCode = batchCode;
        this.subject = subject;
        this.faculty = faculty;
        this.totalClasses = totalClasses;
    }

    public int getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public void setTotalClasses(int totalClasses) {
        this.totalClasses = totalClasses;
    }
}
