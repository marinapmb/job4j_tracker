package ru.job4j.pojo;

import java.time.LocalDate;

public class Student {
    private String name;
    private int groupId;
    LocalDate enrollDate;

    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(int year, int month, int dayOfMonth) {
        this.enrollDate = LocalDate.of(year, month, dayOfMonth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

}
