package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс");
        double kurs = in.nextDouble();
        System.out.println("Введите количество рублей");
        double amountr = in.nextDouble();
        double rez = amountr / kurs;
        System.out.printf("Курс доллара: %.2f \n", kurs);
        System.out.printf("Количество рублей: %.2f \n", amountr);
        System.out.printf("Итого: %.2f долларов" , rez);
    }
}