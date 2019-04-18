package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int days;
        String monthName;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of days for month: ");
        days=input.nextInt();

        switch (days){
            case 27: monthName = "February";
                break;
            case 28: monthName="February";
                break;
            case 30: monthName="September April June November";
                break;
            case 31: monthName="January March May July August October December";
                break;
            default: monthName="There are no months that have "+days+" days.";
                break;
        }
        System.out.println(monthName);
    }
}
