package gb.java.lesson1;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(num1(5, 60));
        num2();
        System.out.println(num3(-50));
        num4();
        System.out.println(num5(2010));
    }

    /**
     * Задание 1
     **/

    public static boolean num1(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);

    }

    /**
     * Задание 2
     **/

    public static void num2() {
        int a;
        a = 55599;
        if (a >= 0) {
            System.out.println("Положительное");
        } else if (a < 0) {
            System.out.println("Отрицательное");
        }
    }

    /**
     * Задание 3
     **/

    public static boolean num3(int a) {
        return (a < 0);
    }

    /**
     * Задание 4
     **/

    public static void num4() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Wake up, Neo");
        }

    }

    /**
     * Задание 5
     **/

    public static boolean num5(int a) {

        return (a % 4 == 0 && a % 100 != 0 || a % 400 == 0);

    }
}
