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
        int z = x * y + x * y / 2;

        System.out.println("Ответ = " + z);
    }
}
