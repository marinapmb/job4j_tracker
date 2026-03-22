package ru.job4j.tracker.input;

public class ValidateInput extends ConsoleInput {

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректные данные");
            }
        } while (invalid);
        return value;
    }

    @Override
    public int askInt(String question, int min, int max) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.askInt(question);
                if (value < min || value > max) {
                    System.out.println("Пожалуйста, выберите число от " + min + " до " + max);
                } else {
                    invalid = false;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректное число");
            }
        } while (invalid);
        return value;
    }
}
