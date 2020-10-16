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


//         *
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


//                *
//              * *
//            * * *
//          * * * *
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

//        for (int i = 0; i <=n  ; i++) {
////            for (int j = 0; j <= n- i - 1 ; j++) {
////                System.out.print("  ");
////            }
////            for (int j = 0; j < i  ; j++) {
////                System.out.print("* ");
////            }
////            System.out.println();
////
////            if(i == n){
////                for (int i1 = 0; i1 < n ; i1++) {
////
////
////                    for (int j = 0; j <= i1 - 1 + 1; j++) {
////                        System.out.print("  ");
////                    }
////                    for (int j = 0; j < n - i1 - 1; j++) {
////                        System.out.print("* ");
////                    }
////                    System.out.println();
////                }
////            }
////        }


//        * * *   * * *
//        * *       * *
//        *           *
//
//        *           *
//        * *       * *
//        * * *   * * *

//        for (int i = 0; i <= n ; i++) {
//            for (int j = 0; j <= n - i - 1; j++) {
//                System.out.print("* ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("  ");
//            }
//            for (int k = 0; k <i ; k++) {
//                System.out.print("  ");
//            }
//
//                for (int k = 0; k < n -i ; k++) {
//                    System.out.print("* ");
//                }
//
//
//
//
//
//            System.out.println();
//
//        }
//
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j <= i ; j++) {
//                System.out.print("* ");
//            }
//
//            for (int j = 0; j <n-i ; j++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 0; j < n - i - 1 ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//
//                                            1
//                                        1  2  3
//                                    1  2  3  4  5
//                                1  2  3  4  5  6  7
//                            1  2  3  4  5  6  7  8  9


//        for (int i = 0; i <= n ; i++) {
//            for (int j = 0; j <= n-i -1  ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j < (2*i)+1 -1 ; j++) {
//                System.out.print(" "+j+" ");
//            }
//            for (int j = 0; j <= n-i -1  ; j++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }


//                                     1
//                                   2 0 2
//                                 3 0 0 0 3
//                              4 0 0 0 0 0 4
//                            5 0 0 0 0 0 0 0 5

//        for (int i = 1; i <= n ; i++) {
//            for (int j = 0; j <= n- i -1 ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j <= i ; j++) {
//                System.out.print(j+" ");
//            }
//
//            for (int j = 1; j < i ; j++) {
//                System.out.print(0+" ");
//            }
//
//            for (int j = 1; j < i-1 ; j++) {
//                System.out.print(0+" ");
//            }
//            for (int j = i; j <= i && j != 1; j++) {
//
//                System.out.print(j+" ");
//            }
//            System.out.println();
//       }

//                                                       0
//                                                     9 0 9
//                                                   8 9 0 9 8
//                                                 7 8 9 0 9 8 7
//                                               6 7 8 9 0 9 8 7 6
//                                             5 6 7 8 9 0 9 8 7 6 5
//                                           4 5 6 7 8 9 0 9 8 7 6 5 4
//                                        3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
//                                      2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
//                                    1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1


//        System.out.println("                    "+0);
//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j <= n- i -1 ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = n -i ; j >= n -i ; j--) {
//                System.out.print(j+" ");
//            }
//
//            for (int j = n -i +1; j <= n ; j++) {
//                System.out.print(j+" ");
//            }
//
//
//
//            for (int j = 0; j <= 0 ;j++) {
//                System.out.print(0+" ");
//            }
//
//            for (int j = n ; j >= n -i ; j--) {
//                System.out.print(j+" ");
//            }
////            for (int j = n -i +1; j <= n ; j++) {
////                System.out.print(j+" ");
////            }
//
////            for (int j = i; j <= i && j != 1; j++) {
////
////                System.out.print(j+" ");
////            }
//            System.out.println();
//       }

//        * 
//        * * 
//        *   * 
//        *     * 
//        * * * * *

//        System.out.println("* ");
//        for (int i = 0; i < n ; i++) {
//            System.out.print("* ");
//            for (int j = 0; j < i ; j++) {
//                System.out.print("  ");
//            }
//            System.out.print("* ");
//            System.out.println();
//        }
//
//        for (int i = 0; i <= n + 1 ; i++) {
//            System.out.print("* ");
//        }

//            *
//          * *
//        *   *
//      *     *
//    * * * * *

//        for (int i = 0; i < n ; i++) {
//            for (int j = 0; j <= n -i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j <=  i  ; j++) {
//                System.out.print("* ");
//            }
//
//            if (i > 1 && i < n -1){
//                for (int j = 2; j < (2*i) ;j++) {
//                    System.out.print(" ");
//
//                }
//
//            }
//
//            if (i > 0 && i < n-1){
//                for (int j = 0; j <=0 ; j++) {
//                    System.out.print("* ");
//                }
//            }
//            if (i == n - 1 ){
//                for (int j = 0; j < n-1 ; j++) {
//                    System.out.print("* ");
//            }
//            }
//            System.out.println();
//        }
        int variable = 1;
        int secVariable = 0;
        int thirdVariable = 0;

        for (int i = 0; i <= n ; i++) {

            for (int j = 0; j <= n - i - 1 ; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 1 ; j++) {
                System.out.print(variable+secVariable);
            }


            System.out.println();
        }
        for (int i = 0; i <= n -1 ; i++) {
            for (int j = 1; j < 1 ; j++) {
                System.out.print(variable+secVariable + thirdVariable);
                thirdVariable++;
            }
        }

    }
}