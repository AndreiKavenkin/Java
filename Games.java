package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        String[][] field = initField(5);
        printField(field);
        while (true) {
            humanTurn(field);
            printField(field);
            if (isDraw(field)){
                break;
            }
            if (isWinner(field,"X")){
                System.out.println("Игрок победили");
                break;
            }
            aiTurn(field);
            printField(field);
            if (isDraw(field)){
                break;
            }
            if (isWinner(field,"0")){
                System.out.println("Компьютер победил");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static String[][] initField(int size) {
        String[][] field = new String[size][size];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = "*";
            }
        }
        return field;
    }
    public static void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }
    public static void humanTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Укажите клетку X и Y:");
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int size = field.length;
            if (x < size && y < size && x >= 0 && y >= 0) {
                if (field[x][y].equals("*")) {
                    field[x][y] = "X";
                    break;
                } else {
                    System.out.println("Вы сходили не туда");
                }
            } else {
                System.out.println("Вы нажали не на игровое поле");
            }
        }
    }
    public static void aiTurn(String[][] field) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Random random = new Random();
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            if (field[x][y].equals("*")) {
                field[x][y] = "0";
                break;
            }
        }
        System.out.println("Компьютер походил");
    }
    public static boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isWinner(String[][] field, String win) {
        int horizontal, vertical, diagonal1, diagonal2;
        int fo_win = 4;
        for (int i = 0; i < field.length; i++) {
            horizontal = 0; vertical = 0;
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == win) {
                    horizontal++;
                } else if (field[i][j] != win && horizontal < fo_win) {
                    horizontal = 0;
                }
                if (field[j][i] == win) {
                    vertical++;
                } else if (field[j][i] != win && vertical < fo_win) {
                    vertical = 0;
                }
            }
            if (horizontal >= fo_win || vertical >= fo_win) {
                return true;
            }
        }
        for (int j = 0; j < field[0].length; j++) {
            diagonal1 = 0;
            for (int i = 0; i < field.length; i++) {
                int n = j + i;
                if (n < field.length) {
                    if (field[i][n] == win) {
                        diagonal1++;
                    }
                    if (field[i][n] != win && diagonal1 < fo_win) {
                        diagonal1 = 0;
                    }
                    if (field[n][i] == win) {
                        diagonal1++;
                    } else if (field[n][i] != win && diagonal1 < fo_win) {
                        diagonal1 = 0;
                    }
                }
                if (diagonal1 >= fo_win) {
                    return true;
                }
            }
        }
        for (int j = 0; j < field[0].length; j++) {
            diagonal2 = 0;
            for (int i = 0; i < field.length; i++) {
                int n = (field.length - 1) - i;
                int m = j + i;
                if (n >= 0 && m < field.length) {
                    if (field[m][n] == win) {
                        diagonal2++;
                    } else if (field[m][n] != win && diagonal2 < fo_win) {
                        diagonal2 = 0;
                    }
                }
                if (diagonal2 >= fo_win) {
                    return true;
                }
            }
        }
        for (int j = 1; j < field[0].length; j++) {
            diagonal2 = 0;
            for (int i = 0; i < field.length; i++) {
                int n = (field.length - 1) - j - i;
                if (n >= 0) {
                    if (field[i][n] == win) {
                        diagonal2++;
                    } else if (field[i][n] != win && diagonal2 < fo_win) {
                        diagonal2 = 0;
                    }
                }
                if (diagonal2 >= fo_win) {
                    return true;
                }
            }
        }
        return false;
    }
}