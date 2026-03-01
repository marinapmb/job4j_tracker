package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student freshStudent = freshman;
        Object object = freshman;

        //Вариант 2
        Student frStudent = new Freshman();
        Object freshObject = new Freshman();
    }
}
