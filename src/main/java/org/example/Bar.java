package org.example;

import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the product quantity: ");
        Integer productQuantity = read.nextInt();
        System.out.println("Total quantity: " + productQuantity);

        //How to obtain a date of my system
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//
//        //How to define a date
//        LocalDate date1 = LocalDate.of(2023, 2, 26);
//        System.out.println(date1);
//
//        //Find the difference between two dates
//        Long differenceBetweenDates = ChronoUnit.DAYS.between(date, date1);
//        System.out.println(differenceBetweenDates);
    }
}