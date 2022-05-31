package Lesson_2;
/*
Решил выполнить задания в двух вариантах:
Task_1 - задание выполнено с условием,что данные на вход вводит пользователь через консоль.
Task_1_1 - задание выполнено с условием, что данные на вход поступают из главного метода(как на уроке)

 */

import java.util.Scanner;
public class Lesson_2 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        task_1();
        boolean a = task_1_1(11,5);
        System.out.println(a);


        task_2();

        task_2_2(5);

        task_3();

        boolean c = task_3_3(-11);
        System.out.println(c);

        task_4();
        task_4_4("rashid",5);



    }

    public static void task_1() {
        System.out.println(ANSI_YELLOW + "Task_1" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Введите первое число!" + ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(ANSI_YELLOW + "Введите второе число!" + ANSI_RESET);
        int b = scanner.nextInt();
        int c = a + b;
        boolean d = c >= 10 && c <= 20;
        System.out.println(d);

    }

    public static boolean task_1_1(int num1, int num2) {
        System.out.println(ANSI_YELLOW + "Task_1_1" + ANSI_RESET);
        int a = num1 + num2;
        boolean c = a >= 10 && a <= 20;
        return c;


    }


    public static void task_2() {
        System.out.println(ANSI_YELLOW + "Task_2" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Введите  число!" + ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println("Вы ввели отрицательное число!");
        } else {
            System.out.println("Вы ввели положительное чило!");
        }

    }

    public static void task_2_2(int a)  {
        if (a < 0) {
            System.out.println("Вы ввели отрицательное число!");
        } else {
            System.out.println("Вы ввели положительное чило!");
        }

    }



    public static void task_3() {
        System.out.println(ANSI_YELLOW + "Task_3" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Введите число,если оно положительное увидите false,иначе- true" + ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean d = a < 0;
        System.out.println(d);

    }


    public static boolean task_3_3(int num1) {
        System.out.println(ANSI_YELLOW + "Task_3_3" + ANSI_RESET);
        int a = num1;
        boolean c = a < 0;
        return c;

    }

    public static void task_4() {
        System.out.println(ANSI_YELLOW + "Task_4" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Введите слово/Фразу" + ANSI_RESET);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(ANSI_YELLOW + "Число повторов" + ANSI_RESET);
        Scanner scanner2 = new Scanner(System.in);
        int c = scanner2.nextInt();
        for (int q = 0; q < c; q++) {
            System.out.println(text);
        }

    }

    public static void task_4_4(String text,int n)  {
        System.out.println(ANSI_YELLOW + "Task_4" + ANSI_RESET);
        for (int q = 0;q < 5; q++) {
            System.out.println(text);
        }

    }







}
