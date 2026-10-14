package com.mycompany.activity2class;

import java.util.Scanner;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class Activity2Class {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        
        System.out.print("Enter total pages of the book: ");
        int tPage = input.nextInt();

        System.out.print("Enter how many pages have been read: ");
        int pRead = input.nextInt();
        
        input.nextLine();
        
        LocalDate issueDate = null;
        LocalDate dueDate = null;
        LocalDate today = LocalDate.now();

        while (issueDate == null) {
            System.out.print("Enter Issue Date (DD-MM-YYYY): ");
            String issueInput = input.nextLine();
            try {
                issueDate = LocalDate.parse(issueInput, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use DD-MM-YYYY (e.g., 14-10-2026).");
            }
        }
        
        while (dueDate == null) {
            System.out.print("Enter the Due Date (DD-MM-YYYY): ");
            String dueInput = input.nextLine();
            try {
                dueDate = LocalDate.parse(dueInput, formatter);
                if (dueDate.isBefore(issueDate)){
                    System.out.println("Due Date cannot be before the issue date.");
                    dueDate = null;
                }
            } catch (DateTimeParseException e) {
                System.out.println("Invalid format. Please use DD-MM-YYYY (e.g., 14-10-2026).");
            }
        }
        
        System.out.println("\n--- Library System Calculations ---");
        
        long tDAllotted = ChronoUnit.DAYS.between(issueDate, dueDate);
        long dRemain = ChronoUnit.DAYS.between(today, dueDate);
        
        double percentRead = ((double)pRead / tPage) * 100;
        System.out.printf("Percentage of the book read: %.2f%%\n", percentRead);
        
        System.out.println("Days remaining to return the book: " + dRemain +" days \n(Total allowance: "+ tDAllotted + "days)");
        
        int pRemain = tPage - pRead;
        if(pRemain <= 0){
            System.out.println("You have already finished the book");
        } else if (dRemain <= 0){
            System.out.println("Borrowing Time has expired.");
        } else {
            double pPD = (double) pRemain / dRemain;
            System.out.printf("Reading amount to finish the book: %.1f pages per day", pPD);
        }
        input.close();
    }
}
