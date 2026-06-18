package homework_5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiArrays {
    /*

     */
    public static void main(String[] args) {
        MultiArrays multiArrays = new MultiArrays();
        Scanner scanner = new Scanner(System.in);
        //Задача 1:
        System.out.println("Задача: ___1___");
        System.out.println("Введите число: ");
        System.out.println(multiArrays.specialArray(scanner.nextInt()));
        //Задача 2:
        System.out.println("\nЗадача: ___2___");
        multiArrays.chessboard();
        //Задача 3:
        System.out.println("\nЗадача: ___3___");
        System.out.println("Ведите количество колоннок: ");
        int n = scanner.nextInt();
        System.out.println("Ведите длину колонки: ");
        int m = scanner.nextInt();
        multiArrays.snake(n, m);
    }

    /*
    Задача 1:
1.1 Создать двумерный массив, заполнить его случайными числами.
1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
1.3 Найти сумму всех получившихся элементов и вывести в консоль.
     */
    public String specialArray(int userNumbers) {
        Random random = new Random();
        int[][] arr = new int[random.nextInt(1, 7)][random.nextInt(2, 10)];
        for (int i = 0; i < arr.length; i++) {
            for (int y = 0; y < arr[i].length; y++) {
                arr[i][y] = random.nextInt(1, 20);
            }
        }
        System.out.println(
                "Ваш массив: " + Arrays.deepToString(arr) +
                        "\nЧисло которое будет добавляться к каждому значению массива: " + userNumbers
        );
        int sumNumbers = 0;
        for (int[] row : arr) {
            for (int value : row) {
                sumNumbers += value + userNumbers;
            }
        }
        return "Сумму всех элементов массива: " + sumNumbers;
    }

    /*
    Задача 2:
Создать программу для раскраски шахматной доски с помощью цикла. Создать
двумерный массив String 8х8. С помощью циклов задать элементам массива значения
B(Black) или W(White). При выводе результат работы программы должен быть
следующим:
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
     */
    public void chessboard() {
        String[][] board = new String[8][8];
        System.out.println("\nШахматная доска:\n");
        for (int i = 0; i < board.length; i++) {
            for (int y = 0; y < board[i].length; y++) {
                board[i][y] = ((i + y) % 2) == 0 ? "W" : "B";
                System.out.print(board[i][y] + " ");
            }
            System.out.println();
        }
    }

    /*
    Задача *:
Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
Формат входных данных:
Программа получает на вход два числа n и m.
Формат выходных данных:
Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
символа.
     */
    public void snake(int n, int m) {
        int[][] a = new int[n][m];
        int count = 0;
        System.out.println("Ваша змейка:");
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < m; j++)a[i][j] = count++;
            } else {
                for (int j = m - 1; j >= 0; j--) a[i][j] = count++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}
