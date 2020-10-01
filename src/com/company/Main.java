package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Patters Tutorial
        // * * * * * * *
        //* * * * * *
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

        Scanner cs = new Scanner(System.in);
        int userValue = cs.nextInt();

        for (int i = 0; i <= userValue; i++) {
            for (int j = 0; j < userValue-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
