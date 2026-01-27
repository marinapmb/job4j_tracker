package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Воронов Николай Иванович");
        student.setGroupId(101);
        student.setEnrollDate(2025, 9, 1);
        System.out.println("Студент " + student.getName() + ", группа " + student.getGroupId()
                + ", дата поступления " + student.getEnrollDate());
    }
}
