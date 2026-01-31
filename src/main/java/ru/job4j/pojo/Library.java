package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bookGoya = new Book("Goya", 300);
        Book bookBallad = new Book("The Spanish Ballad ", 258);
        Book bookJava = new Book("Java", 1137);
        Book bookCode = new Book("Clean Code", 800);

        Book[] books = new Book[4];
        books[0] = bookGoya;
        books[1] = bookBallad;
        books[2] = bookJava;
        books[3] = bookCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages() + " pages");
        }
        Book temp;
        temp = bookGoya;
        books[0] = bookCode;
        books[3] = temp;

        System.out.println("Changed array");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages() + " pages");
        }

        System.out.println("Clean code book");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName() + " - " + book.getPages() + " pages");
            }
        }

    }
}
