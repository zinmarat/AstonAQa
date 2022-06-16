package com.company;
import java.util.Scanner;
public class HelloV {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя\n");
        var checkName = in.nextLine();
        String comparingName = "Вячеслав";
        if (checkName.equalsIgnoreCase(comparingName)) {
            System.out.print("Привет, Вячеслав\n");
        } else {
            System.out.print("Нет такого имени\n");
        }
    }
}