package ru.synergyitacademy.lesson2;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        //запрос чисел от пользователя без проверки вводимых данных.
        System.out.println("Введите первое число и нажмите Enter.");
        int x = console.nextInt();
        System.out.println("Введите второе число и нажмите Enter.");
        int y = console.nextInt();
        // вычисления.
        int z = x * y + x * y / 5;

        System.out.println("Ответ = " + z);

        System.out.println("Введите первое вещественное число через запятую и нажмите Enter.");
        double x2 = console.nextDouble();
        System.out.println("Введите второе вещественное число через запятую и нажмите Enter.");
        double y2 = console.nextDouble();
        // вычисления.
        double z2 = x2 * y2 + x2 * y2 / 2.25;

        System.out.println("Ответ = " + z2);
    }
}
