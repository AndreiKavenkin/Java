package Lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        boolean a = summa(6, 4);
            System.out.println(a);
        notreturn(-14564);
        boolean b = withreturn(13214);
            System.out.println(b);
        isNWords("Hello world!", 10);
        boolean c = calendar(1600);
            System.out.println(c);
    }
    public static boolean summa(int num1, int num2) {
        int sum = num1 + num2;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void notreturn(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean withreturn(int j) {
        if (j >= 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void isNWords(String message, int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(message + " " + "n:" + num);
            num++;
        }
    }
    public static boolean calendar(int y) {
        if (y%4==0 && y % 100 != 0 || y % 400 == 0){
            return true;
        }else
            return false;
    }
}