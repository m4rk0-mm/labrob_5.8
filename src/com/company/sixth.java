package com.company;

import java.util.Scanner;

public class sixth {
    public static void main(String[]args){
        System.out.println("Ведіть кількість секунд :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a / 3600 < 1) System.out.println("До кінця робочого дня менше 1 години");
        else if(a == 1) System.out.println("До кінця робочого дня 1 година");
        else if(a > 28800) System.out.println("Не вірно ведені дані");
        else System.out.println("До кінця робочого дня " + a / 3600 + " годин");


    }
}
