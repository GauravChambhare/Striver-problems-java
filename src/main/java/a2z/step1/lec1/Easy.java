package a2z.step1.lec1;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Easy {
    public static void main(String[] args)
    {
        // creating the instance of class BufferedReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String name;
        try {
            System.out.println("Enter your name");
            name = reader.readLine(); // taking string input
            System.out.println("Name(BufferedReader) = " + name);
        }
        catch (Exception e) {
//            Alternatively, if you just want the exception message:
            System.out.println(e.getMessage());


// Instead of this (which raises the warning):
            System.out.println(e); // Will print something like: java.lang.Exception@1b6d3586

// Do this:
            e.printStackTrace(); // Prints the detailed stack trace to the console

        }
//        Using Scanner we can take input like below
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Name(Scanner) = " + s);
    }
}

