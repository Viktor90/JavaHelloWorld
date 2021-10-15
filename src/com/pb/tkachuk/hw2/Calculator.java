package com.pb.tkachuk.hw2;

import sun.awt.geom.AreaOp;

import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int FirstValue, SecondValue, Result;
        String Sign;

        System.out.println("Enter Fist value ");
        FirstValue = in.nextInt();
        System.out.println("Enter Second value ");
        SecondValue = in.nextInt();
        System.out.println("Enter operator + - / * ");
        Sign = in.next();

        switch (Sign)
        {
            case "+":
                Result = FirstValue + SecondValue;
                System.out.println(FirstValue + " + " +  SecondValue + " = " + Result);
                break;
            case "-":
                Result = FirstValue + SecondValue;
                System.out.println(FirstValue + " - " +  SecondValue + " = " + Result);
                break;
            case "*":
                Result = FirstValue + SecondValue;
                System.out.println(FirstValue + " * " +  SecondValue + " = " + Result);
                break;
            case "/":
                Result = FirstValue + SecondValue;
                if(SecondValue == 0)
                {
                    System.out.println("Cannot be divided by zero");
                }
                else
                    System.out.println(FirstValue + " / " +  SecondValue + " = " + Result);
                break;

        }
        System.out.println("Thanks");












    }
}
