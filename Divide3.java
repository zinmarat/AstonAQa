package com.company;
import java.util.Scanner;
public class Divide3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите числа через пробел, программа выведет числа кратные трём\n");
        String checkStr = in.nextLine();
        String strArray[] = checkStr.split(" "); 
        int numArray[] = new int[strArray.length]; 
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].matches("[-+]?\\d+")){ // 
                numArray[i] = Integer.parseInt(strArray[i]);
                if(numArray[i]%3==0 && numArray[i] !=0){
                    System.out.println(numArray[i]);
                }

            }
        }}}