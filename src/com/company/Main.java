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
            for (int j = userValue; j >= i  ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
