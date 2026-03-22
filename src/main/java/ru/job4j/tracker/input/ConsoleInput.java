package ru.job4j.tracker.input;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    @Override
    public int askInt(String question, int min, int max) {
        int value;
        do {
            value = askInt(question);
            if (value < min || value > max) {
                System.out.println("Пожалуйста, выберите число от " + min + " до " + max);
            }
        } while (value < min || value > max);
        return value;
    }
}