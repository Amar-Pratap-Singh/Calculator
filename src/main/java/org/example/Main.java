package org.example;

// import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


public class Main {


    // private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static int add(int a, int b){
        return a + b;
    } 

    public static int subtract(int a, int b){
        return a - b;
    } 

    public static int multiply(int a, int b){
        return a * b;
    } 

    public static int divide(int a, int b){
        return a / b;
    } 


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----Welcome to Calculator----");
        System.out.println("Choose Your Operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        // System.out.println("5. Exit");

        int choice = sc.nextInt();

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        // take input
        if (choice == 1){
            System.out.println("Result: " + add(a, b));
            // add(a, b);
        }
        else if (choice == 2){
            subtract(a, b);
        }
        else if (choice == 3){
            multiply(a, b);
        }  
        else if (choice == 4){
            divide(a, b);
        }
        else{
            System.out.println("Invalid Input!");
        }
    }
}
