package com.company;

import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter rows first then column");
        int rows = sc.nextInt();
        int column = sc.nextInt();


        int a[][] = new int[rows][column];
        int b[][] = new int[column][rows];

        System.out.println("Enter array a");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter array b");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < column; j++) {
                b[i][j] = sc.nextInt();
            }
        }

            int c[][] = new int[rows][column];

            for (int i = 0; i < rows ; i++) {
                for (int j = 0; j < column; j++) {
                    c[i][j] = a[i][j] * b[j][i];
                }
            }
                for (int i = 0; i < rows ; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(c[i][j] + " ");
                    }



        }
    }
}
