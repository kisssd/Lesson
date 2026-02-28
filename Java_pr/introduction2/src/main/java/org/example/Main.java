package org.example;

import java.util.Scanner;

public class Main {

    static int staticfieldExample;
    int instanceFieldExample;
    // stic osztály szinten értelmezendő

    public static void main(String[] args) {
        int newlenght = 0;
        int localVariableExample = 0;
        System.out.println("Hello, World!");
        staticfieldExample = 54654654;
        //    instanceFieldExample = 454545;

        // Scanner = Scanner osztály
        // scanner = egy konkrét példány
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please ent your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please ent your e-mail: ");
        String email = scanner.nextLine();

        String text = "-";

        if(name.length()>email.length()){
            System.out.println(text.repeat(name.length()));
            newlenght = name.length();
        } else {
            System.out.println(name.repeat(email.length()));
            newlenght = email.length();
        }

        System.out.println("-".repeat(newlenght));
        System.out.println(name);
        System.out.println("-".repeat(newlenght));
        System.out.println(age);
        System.out.println("-".repeat(newlenght));
        System.out.println(email);
        System.out.println("-".repeat(newlenght));

        System.out.printf("%-30s xgfdg fsdf %s", "hello", "world");
        System.out.println();
        System.out.printf("%-30s xgfdg fsdf %s%n", "hellosdfdsf", "world");
        System.out.println("The lenght of your name is: " + name.length());
        System.out.printf("The lenght of your name is: %d%n", name.length());


        if (name.length() > 9) {
            System.out.println("The name is reasonably long");
        } else {
            System.out.println("Your name is to sort");

        }

        System.out.println("Please enter a number");
        int scannerAge = new Scanner(System.in).nextInt();
        if(scannerAge > 5){
            System.out.println("The number is bigger than 5");
        } else {
            System.out.println("The number doesnt bigger than 5");
        }
    }
}
