package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active = " + active);
        System.out.println("Status = " + status);
        System.out.println("Message = " + message);
    }

    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.printInfo();
        Error errorStatus1 = new Error(false, 1, "Status1");
        errorStatus1.printInfo();
        Error errorStatus2 = new Error(true, 2, "Status2");
        errorStatus2.printInfo();
    }
}
