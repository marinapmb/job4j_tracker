package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Элемент '" + key + "' не найден в массиве");
    }

    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "four", "five"};

        String missingKey = "six";
        try {
            int index = indexOf(array, missingKey);
            System.out.println("Индекс элемента '" + missingKey + "': " + index);
        } catch (ElementNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}