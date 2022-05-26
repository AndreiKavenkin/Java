package Lesson3;

import java.util.Arrays;

public class HomeWorkMassive {
    public static void main(String[] args) {
        invertMassive();
        isMassive100(1);
        isMassivemin6on2();
        isMassiveSquare(9);
        isMassiveLenValue(4,7);
        isMassiveMaxMin();
        int[] arrm = {1,3,1,3,2,2,2,2};
        System.out.println(isMassiveLeftRight(arrm));
    }
    public static void invertMassive() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            array[i] = 1 - array[i];
        System.out.println("Инверсный массив:" + Arrays.toString(array));
    }
    public static void isMassive100(int a) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a + i;
        }
        System.out.print("Массив от 1 до 100:"+Arrays.toString(nums));
    }
    public static void isMassivemin6on2() {
        int[] arrs = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\nИсходный массив:" + Arrays.toString(arrs));
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] < 6)
                arrs[i] *= 2;
        }
        System.out.println("Вычесленный массив:" + Arrays.toString(arrs));
    }
    public static void isMassiveSquare(int x) {
        int[][] square = new int[x][x];
        System.out.println("|Квадратный двумерный массив|");
        for (int i = 0; i < x; i++) {
            square[i][i] = 1;
            square[i][x - i - 1] = 1;
            System.out.println(Arrays.toString(square[i]));
        }
    }
    public static void isMassiveLenValue(int len, int initialValue){
        int arry[] = new int[len];
        System.out.println("|Одномерный массив|");
        for (int i = 0; i < arry.length; i++){
            arry[i] = initialValue;
            System.out.println("int arry[" + i + "] = " + arry[i] + "; ");
        }
    }
    public static void isMassiveMaxMin(){
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 14};
        System.out.println("Исходный массив:" + Arrays.toString(mass));        int max = mass[0];
        int min = mass[0];
        for (int i = 0; i < mass.length; i++){
            if (mass[i] > max){
                max = mass[i];
            }
            if (mass[i] < min){
                min = mass[i];
            }
        }
        System.out.println("Максимальное значение:" + max);
        System.out.println("Минимальное значение:" + min);
    }
    public static boolean isMassiveLeftRight ( int[] arrm){
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < arrm.length; i++) {
            rightSum += arrm[i];
        }
        for (int i = 0; i < arrm.length; i++) {
            leftSum += arrm[i];
            if (leftSum == rightSum - leftSum) {
                return true;
            }
        }
        return false;
    }
}
