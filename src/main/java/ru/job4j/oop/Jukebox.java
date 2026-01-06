package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        String lyrics;

        switch (position) {
            case 1:
                lyrics = "Пусть бегут неуклюже\n"
                        + "Пешеходы по лужам,\n"
                        + "А вода по асфальту рекой.\n"
                        + "И не ясно прохожим\n"
                        + "В этот день непогожий,\n"
                        + "Отчего я веселый такой.";
                break;
            case 2:
                lyrics = "Спят усталые игрушки, книжки спят,\n"
                        + "Одеяла и подушки ждут ребят.\n"
                        + "Даже сказка спать ложится,\n"
                        + "Чтобы ночью нам присниться.\n"
                        + "Ты ей пожелай: «Баю-бай!»";
                break;
            default:
                lyrics = "Песня не найдена";
        }
        System.out.println(lyrics);
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        song.music(1);
        song.music(2);
        song.music(100);
    }
}
