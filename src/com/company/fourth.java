package com.company;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        System.out.println("Ведіть 'Так', 'ОК', 'Yes', 'Y', '+', 'Ok' " + " або 'Ні', 'NO', 'N', '-', 'No' ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        switch (a){
            case "Так", "OK", "Yes", "Y", "+", "ok" :
                System.out.println("Я погоджуюся!");
                break;
            case "Ні", "NO", "N", "-", "No":
                System.out.println("Я відмовляюся!");
                break;
            default:
                System.out.println("Ви вели не вірне значення");
        }
    }
}
