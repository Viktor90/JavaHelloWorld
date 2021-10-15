package com.pb.tkachuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer in between 0 - 100 ");
        int Value = in.nextInt();

        if(Value >= 0 && Value <= 14)
        {
            System.out.println("The number " + Value +  " ranges from 0 to 14");
        }
        else if (Value >= 15 && Value <= 35)
        {
            System.out.println("The number " + Value +  " ranges from 15 to 35");
        }
        else if (Value >= 36 && Value <= 50)
        {
            System.out.println("The number " + Value +  " ranges from 36 to 50");
        }
        else if (Value >= 51 && Value <= 100)
        {
            System.out.println("The number " + Value +  " ranges from 51 to 100");
        }
        else
        {
            System.out.println("Invalid number entered");
        }
    }
}
