package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        int quantityOfLays = 5;
        int quantityOfPepsi = 5;
        int quantityOfSprite = 5;
        int quantityOfCoke = 5;
        int quantityOfFanta = 5;


        System.out.println("WELCOME TO 'VENDING MACHINE'");
        System.out.println("We have got below items for you:");
        System.out.println("1. Lays $2 (5)\n2. Pepsi $3 (5)\n3. Coke $3 (5)\n4. Sprite $3 (5)\n5. Fanta $3 (5)");
        System.out.println("Enter the product name you would like to buy");
        String productName = sc.next();

        productName = productName.toLowerCase();

        switch (productName){
            case "lays":
                System.out.println("You have chosen lays, kindly mention the quantity of it as well now.");
                int userQuantity = sc.nextInt();
                if(userQuantity>quantityOfLays){
                    System.out.println("Sorry! We don't have enough packs of lays");
                }
                else{
                    quantityOfLays = quantityOfLays - userQuantity;
                    int priceOfLays = 2 * userQuantity;
                    System.out.println("The price is $"+priceOfLays);
                    System.out.println("Would you like to proceed to payment? (y/n)");
                    char choice = sc.next().charAt(0);
                    if (choice == 'y'){
                        System.out.println(userQuantity+" packs of Lays has been given to you!");
                        System.out.println("THANK YOU FOR SHOPPING!");
                    }
                    else {
                        System.out.println("Error in payment!");
                    }
                }
        }




    }

}





























//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a date (MM/DD/YYYY)");
//        String date = sc.next();
//
//        if (date.length() == 10) {
//
//            int month = Integer.parseInt(date.substring(0, 2));
//            int day = Integer.parseInt(date.substring(3, 5));
//            int year = Integer.parseInt(date.substring(6));
//
//            if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31) && month >= 1) {
//                if (year % 4 == 0) {
//                    if (month == 02 && (day >= 1 && day <= 29)) {
//                        System.out.println("Valid Leap Year Date!");
//                    } else if (month != 02 && (day >= 1 && day <= 31)) {
//                        System.out.println("Valid date! ");
//                    } else {
//                        System.out.println("Invalid date!");
//                    }
//                }
//                else {
//                    if (month != 02 && (day >= 1 && day <= 31)) {
//                        System.out.println("Valid Date!");
//                    } else if (month == 02 && (day >= 1 && day <= 28)) {
//                        System.out.println("Valid Date");
//                    } else {
//                        System.out.println("Invalid Date");
//                    }
//                }
//            }
//            else {
//                System.out.println("Not valid");
//            }
//
//        }
//        else if(date.length() == 9) {
//            int index = date.indexOf("/");
//            if(index == 1){
//                    // Month is of single digit
//
//                int month = Integer.parseInt(date.substring(0,1));
//                int day = Integer.parseInt(date.substring(2,4));
//                int year = Integer.parseInt(date.substring(5));
//
//                    if(year %4 ==0){
//                        //For leap year!
//                        if ((month == 2) && (day>=1 && day<=29)){
//                            System.out.println("Valid leap year day!");
//                        }
//                        else if((month!=2) && (day>=1 && day<=31)){
//                            System.out.println("Valid date!");
//                        }
//                        else{
//                            System.out.println("Invalid date!");
//                        }
//                    }
//                    else{
//                        //For Non-leap year!
//                        if ((month == 2) && (day>=1 && day<=28)){
//                            System.out.println("Valid leap year day!");
//                        }
//                        else if((month!=2) && (day>=1 && day<=31)){
//                            System.out.println("Valid date!");
//                        }
//                        else{
//                            System.out.println("Invalid date!");
//                        }
//
//                    }
//
//            }
//            else {
//                    // Day is of single digit
//                int month = Integer.parseInt(date.substring(0,2));
//                int day = Integer.parseInt(date.substring(3,4));
//                int year = Integer.parseInt(date.substring(5));
//
//                if(year %4 ==0){
//                    //For leap year!
//                    if ((month == 2) && (day>=1 && day<10)){
//                        System.out.println("Valid Date!");
//                    }
//                    else if((month!=2) && (day>=1 && day<10)){
//                        System.out.println("Valid date!");
//                    }
//                    else{
//                        System.out.println("Invalid date!");
//                    }
//                }
//                else{
//                    //For Non-leap year!
//                    if ((month == 2) && (day>=1 && day<10)){
//                        System.out.println("Valid leap year day!");
//                    }
//                    else if((month!=2) && (day>=1 && day<10)){
//                        System.out.println("Valid date!");
//                    }
//                    else{
//                        System.out.println("Invalid date!");
//                    }
//
//                }
//
//            }
//
//        }
//        else if(date.length() == 8 ){
//
//            int day =0,month = 0,year=0;
//            try {
//                month = Integer.parseInt(date.substring(0,1));
//                day = Integer.parseInt(date.substring(2,3));
//                year = Integer.parseInt(date.substring(4));
//            }catch (Exception e){
//                System.out.println(e);
//            }
//
//
//        }





















//
//        System.out.println("Enter 3 numbers");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int first = 0;
//        int second = 0;
//        int third = 0;
//
//        if(a<=b && a<=c){
//            first = a;
//            if(b<=c){
//                second = b;
//                third = c;
//            }
//            else{
//                second = c;
//                third = b;
//            }
//        }
//        else if (b<=a && b<=c) {
//            first = b;
//            if(a<=c){
//                second = a;
//                third = c;
//            }
//            else{
//                second = c;
//                third = a;
//            }
//
//        }
//        else if(c<=a && c<=b){
//            first = c;
//            if(a<=b){
//                second = a;
//                third = b;
//            }
//            else{
//                second = b;
//                third = a;
//            }
//        }
//        else{
//            System.out.println("Incorrect input!");
//        }
//
//        System.out.println("The accesending order is: "+first +" "+second+" "+third);
//




















































