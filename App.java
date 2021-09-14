package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private  static int driveAge = 16;
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.print("What is your name? ");
        age = scan.nextInt();
        if (age >= driveAge)
            System.out.println("You are old enough to legally drive.");
        else
            System.out.println("You are not old enough to legally drive.");
    }
}
