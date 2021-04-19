package gb.java;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Задание 1: " + Arrays.toString(num1()));
        System.out.println("Задание 2: " + Arrays.toString(num2()));
        System.out.println("Задание 3: " + Arrays.toString(num3()));
        System.out.println("Задание 4: ");
        num4(7);
        System.out.println("Задание 5: " + Arrays.toString(num5(10, 666)));
    }

    /**
     * Задание 1
     **/

    public static int[] num1() {
        int[] ex1 = new int[]{1, 0, 0, 1, 0};
        for (int i = 0; i < ex1.length; i++) {
            if (ex1[i] != 0) {
                ex1[i] = 0;
            } else {
                ex1[i] = 1;
            }

        }
        return ex1;
    }

    /**
     * Задание 2
     **/

    public static int[] num2() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        return a;
    }

    /**
     * Задание 3
     **/

    public static int[] num3() {
        int[] b = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < b.length; i++) {
            if (b[i] < 6) b[i] *= 2;
        }

        return b;
    }

    /**
     * Задание 4
     **/

    public static void num4(int a) {
        int[][] quad = new int[a][a];
        for (int i = 0; i < quad.length; i++) {
            for (int j = 0; j < quad[i].length; j++) {
                if (i == j) quad[i][j] = 1;
                System.out.print(quad[i][j] + " ");
            }
            System.out.println();

        }
    }

    /**
     * Задание 5
     **/

    public static int[] num5(int len, int initialValue) {
        int[] mas = new int[len];
        for (int i = 0; i < len; i++) {
            mas[i] = initialValue;
        }
        return mas;

    }

}



