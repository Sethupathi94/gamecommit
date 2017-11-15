package com.example;

import java.util.Scanner;

public class MyClass {
 public static  void main(String args[])
 {
     Scanner file_input = new Scanner(System.in);
     System.out.println("Enter a Number : a -->");
     int a = file_input.nextInt();
     System.out.println("Enter a Number : b -->");
     int b = file_input.nextInt();
     int m = a + b;
     int n = a - b;
     int o = a * b;
     int p = a % b;

     System.out.println("Addition --->"+m);
     System.out.println("Subtraction --->"+n);
     System.out.println("Multiplication --->"+o);
     System.out.println("Division --->"+p);
     file_input.close();
 }
}
