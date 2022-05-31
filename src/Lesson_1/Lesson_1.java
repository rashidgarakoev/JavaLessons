package Lesson_1;

public class Lesson_1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        int a = -1;
        int b = 0;
        int c = a + b;
        if (c >= 0) {
            System.out.println("сумма положительна");
        } else {
            System.out.println("сумма отрицательна");
        }

    }

    public static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 7;
        int b = 8;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

}
