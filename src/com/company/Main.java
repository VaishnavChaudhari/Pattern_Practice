package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Patters Tutorial
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

        Scanner cs = new Scanner(System.in);
                int n = cs.nextInt();

//                for (int i = 0; i <= n  ; i++) {
//                    for (int j = 0; j < i - 1 + 1 ; j++) {
//                        System.out.print("  ");
//                    }
//                    for (int j = 0; j < n -i  ; j++) {
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }
        
//        * * * * * * 
//            * * * * * 
//                * * * * 
//                    * * * 
//                        * * 
//                            *

//            for (int i = 0; i <= n ; i++) {
//
//                for (int j = 0; j < i -1 + 1  ; j++) {
//                    System.out.print("    ");
//                }
//
//                for (int j = 0; j <= n-i ; j++) {
//                    System.out.print("* ");
//                }
//
//                System.out.println();
//            }


//          *
//       *  *
//     *  *  *
//   *  *  *  *
// *  *  *  *  *

//        for (int i = 0; i <= n ; i++) {
//            for (int j = 0; j <= n-i -1  ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < i ; j++) {
//                System.out.print(" * ");
//            }
//            for (int j = 0; j <= n-i -1  ; j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i <=n  ; i++) {
            for (int j = 0; j <= n- i - 1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i  ; j++) {
                System.out.print("* ");
            }
            System.out.println();

            if (i >= n ){
                for (int j = 0; j < ; j++) {
                    
                }
            }
        }
    }
}

