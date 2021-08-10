import java.util.Arrays;

public class HomeWorkApp {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[100];
        fillArray(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        changeArray(arr3);

        int[][] arr4 = new int[8][8];
        fillDiagonal(arr4);

        int len = 3;
        int initialValue = 5;
        int[] arr5 = arr6(len, initialValue);
        System.out.println(Arrays.toString(arr5));
        // 5 -ое задание сделал только с помощью Вашего кода... Сам не смог додуматься.
    }

    private static int[] arr6(int len, int initialValue) {
        int [] arr7 = new int [len];
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = initialValue;
        }
        return arr7;
    }

    private static void fillDiagonal(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] [i] = 7;
            System.out.println(Arrays.toString(arr4[i]));
        }
    }

    private static void changeArray(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                System.out.println(arr3[i] * 2);
            } else {
                System.out.println(arr3[i]);
            }
        }
    }

    private static void fillArray(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (1 + i);
        }
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (1 - arr[i]);
        }
    }
}


