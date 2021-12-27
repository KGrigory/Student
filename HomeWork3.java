/*
 * Java. Level 1. Lesson 3. HomeWork3
 * @autor Grigory Kondratyev
 * @version 22.12.2021
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
    static void invertArray() {
        int[]arr = {0,1,1,0,1,0,1,0,1,0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 - arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    static void filArray() {
        int[]arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i;
        }
        System.out.println(Arrays.toString(arr));
    }
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
    static void fillDiagonal() {
        int [][] arr = new int [6][6];
        for (int i = 0; i <arr.length; i++){
            arr [i][i] = 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static int[] retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
}
