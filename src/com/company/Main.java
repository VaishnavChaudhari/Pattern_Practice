package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int n = 6;
       int factorial = 1;
        for (int i = n - 1; i > 0; i--) {
         n *= i;
        }
        System.out.println(n);
    }
}
