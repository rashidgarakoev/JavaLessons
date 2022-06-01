package Lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson_3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {

       task1();
       task2();
       task3();
//        task4();
        task5();

    }

    public static void task1() {
        int[] binary = {0, 0, 1, 1};
        for (int i = 0; i < binary.length; i++) {
            if (binary[i] == 0) {
                binary[i] = 1;
            } else {
                binary[i] = 0;
            }
            System.out.println(binary[i]);
        }


    }

    public static void task2() {
        int[] OneHundred = new int[100];
        for (int i = 0; i < OneHundred.length; i++) {
            OneHundred[i] = i + 1;
            System.out.println(OneHundred[i]);
        }

    }

    public static void task3() {
        int[] MultiplyBy2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < MultiplyBy2.length; i++) {
            if (MultiplyBy2[i] < 6) {
                MultiplyBy2[i] *= 2;
                System.out.println(MultiplyBy2[i]);
            }
        }


    }

    public static void task4() {
        int[][] diag = new int[3][3];
        for (int i = 0; i < 1; i++) ;

        /* diag[0][0] = 1;
        diag[1][1] = 1;
        diag[2][2] = 1;
        System.out.print(diag[0][0] +" ");
        System.out.print(diag[0][1] +" ");
        System.out.println(diag[0][2] +" ");
        System.out.print(diag[1][0] +" ");
        System.out.print(diag[1][1] +" ");
        System.out.println(diag[1][2] +" ");
        System.out.print(diag[2][0] +" ");
        System.out.print(diag[2][1] +" ");
        System.out.println(diag[2][2] +" ");

        */


    }

    public static void task5() {
        System.out.println(ANSI_YELLOW + "¬ведите длину массива!" + ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        System.out.println(ANSI_YELLOW + "¬ведите значение €чеек массива!" + ANSI_RESET);
        int initialValue = scanner.nextInt();
        int[]array=new int[len];
        for(int i=0;i< array.length;i++){
            array[i]=initialValue;
            System.out.println(array[i]);

        }




    }


}