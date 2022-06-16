package com.company;
import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число\n");
        while (!in.hasNextInt()) {
            System.out.println("Это не число");
            in.next();
        }
        var Verification = in.nextInt();
        if(Verification>7){
            System.out.print("Привет");
        }
    }
}
