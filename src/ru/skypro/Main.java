package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задача 1
        int i = 1;
        while (i <= 10) {
            if (i == 10) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
            i++;
        }

        for (i = 10; i > 0; i --) {
            if (i == 1) {
                System.out.println(i);
                break;
            }
            System.out.print(i + " ");
        }

        // Задача 2
        int firstFriday = 1;
        for (firstFriday = 1; firstFriday <= 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

        // Задача 3
        int year = 2022;
        int start = year - 200;
        int finish = year + 100;
        for (int y = start; y < finish; y++) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }

    }
}
