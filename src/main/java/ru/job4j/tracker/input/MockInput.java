package ru.job4j.tracker.input;

public class MockInput implements Input {
    private String[] answers;
    private int position = 0;

    public MockInput(String[] answers) {
        this.answers = answers;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

    @Override
    public int askInt(String question, int min, int max) {
        int value = askInt(question);
        if (value < min || value > max) {
            throw new IllegalArgumentException("Value out of range: " + value
                    + ". Expected between " + min + " and " + max);
        }
        return value;
    }
}