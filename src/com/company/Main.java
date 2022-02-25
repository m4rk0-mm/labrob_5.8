package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ведіть число з проміжку (25 - 100)");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a > 100) System.out.println("Число " + a + " не міститься в проміжку(25 - 100)");
        else if (a < 25) System.out.println("Число " + a + " не міститься в проміжку(25 - 100)");
        else {
            System.out.println("Число " + a + " міститься в проміжку (25 - 100)");
        }

    }
}
