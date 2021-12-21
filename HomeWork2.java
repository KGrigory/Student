/*
 * Java. Level 1. Lesson 2. HomeWork2
 * @autor Grigory Kondratyev
 * @version 20.12.2021
 */

class HomeWork2 {
    public static void main(String[]args) {
        System.out.println(checkSum(7, 10));
        System.out.println(checkSum(-5, 10));
        System.out.println(checkSum(20, 10));

        checkPositiveNegative(0);
        checkPositiveNegative(-5);
        checkPositiveNegative(300);

        System.out.println(checTrueFalse(-10));
        System.out.println(checTrueFalse(0));
        System.out.println(checTrueFalse(10));

        printWordTimes("word", 10);
    }
    /* 1 Написать метод,
    принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */
    static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    /* 2 Написать метод,
    которому в качестве параметра передается целое число,
    метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    static void checkPositiveNegative(int x) {
        System.out.println(x >= 0 ? "Positive" : "Negative");
    }
    /* 3 Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    static boolean checTrueFalse(int y) {
        return y < 0;
    }
    /* 4 Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */
    static void printWordTimes(String w, int t) {
        for (int i = 0; i < t; i++) {
            System.out.println(w);
        }
    }
};
