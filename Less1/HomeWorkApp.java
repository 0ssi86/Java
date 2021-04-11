package gb.java.lesson1;

import sun.security.x509.OtherName;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 4;
        int b = 8;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");

        }
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 50;
        int b = 20;

        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
    }

}
