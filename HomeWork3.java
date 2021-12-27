/*
 * Java. Level 1. Lesson 3. HomeWork3
 * @autor Grigory Kondratyev
 * @version 22.12.2021 - 27.12.2021
 */
import java.util.Arrays;

class HomeWork3 {
    public static void main(String[]args) {
        invertArray();
        filArray();
        changeArray();
        fillDiagonal();
		System.out.println(Arrays.toString(retLenArr(5, 10)));
    }
	/*
	Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        */
    static void invertArray() {
        int[]arr = {0,1,1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
	/*
	Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
	*/
    static void filArray() {
        int[]arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i;
        }
        System.out.println(Arrays.toString(arr));
    }
	/*
	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
	*/
    static void changeArray() {
        int [] arr = {2, 5 , 67, 8, 3, 4, 1, 7, 6, 9};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
	/*
	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
	и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
	Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
	*/
	
    static void fillDiagonal() {
        int [][] arr = new int [6][6];
        for (int i = 0; i <arr.length; i++){
            arr [i][i] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }
	/*
	Написать метод, принимающий на вход два аргумента: len и initialValue,
	и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        */
    static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
