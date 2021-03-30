package com;

import java.util.Scanner;

public class InputText {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть будь яке число");
        int number = scanner.nextInt();
        String text = scanner.nextLine();
        System.out.println("Введіть будь який тест");


        System.out.println("Ваші отримані дані: ");
        System.out.println("Ви ввели число: " + number);
        System.out.println("Ви ввели текс: " + text);
    }
}

