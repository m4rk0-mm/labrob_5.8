package com.company;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        System.out.println("Підніматися чи Опускатися :");
        Scanner scanner_2 = new Scanner(System.in);
        String a_2 = scanner_2.nextLine();

        System.out.println("Виберіть поверх який хочете відвідати :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();



        if(a_2.equals("Підніматися")){
                if(a > 9 || a < 1){
                    System.out.println("Ви вказали не існуючий поверх");
                } else if(a == 2){
                    System.out.println("Нажаль на даний момент ліфт не піднімається на 2 поверх");
                    System.out.println("Піднімаємося на 3 поверх");

                }else if(a == 1){
                    System.out.println("Не можна підніматися на перший поверх");

                }else System.out.println("Піднімаємося на " + a +" поверх");
        }

        if (a_2.equals("Опускатися")){
            if(a > 9 || a < 1){
                System.out.println("Ви вказали не існуючий поверх");
            }else if(a == 2){
                System.out.println("Нажаль зараз ліфт не опускається на 2 поверх");
                System.out.println("Опускаємося на 1 поверх");
            }else if(a == 9){
                System.out.println("Не можна опускатися на девятий поверх");
            } else System.out.println("Опускаємося на " + a + " поверх");

        }



    }
}
