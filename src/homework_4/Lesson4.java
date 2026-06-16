package homework_4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Lesson4 lesson4 = new Lesson4();
        //Задача 1:
        System.out.println("\nЗадача: ___1___");
        lesson4.outputStraightAndBack();
        //Задача 2:
        System.out.println("\nЗадача: ___2___");
        lesson4.minAndMaxValue();
        //Задача 3:
        System.out.println("\nЗадача: ___3___");
        lesson4.minAndMaxIndex();
        //Задача 4:
        System.out.println("\nЗадача: ___4___");
        lesson4.zeroElementCounter();
        //Задача 5:
        System.out.println("\nЗадача: ___5___");
        lesson4.swapElements();
        //Задача 6:
        System.out.println("\nЗадача: ___6___");
        lesson4.arrayIncreasingOrNot();
        //Задача *:
        System.out.println("\nЗадача: ___*___");
        System.out.println("Ваш массив с увеличением последнего числа на 1: " +
                Arrays.toString(
                        lesson4.plusOne(
                                lesson4.createAnArray()
                        )
                )
        );
    }

    /*
    Условие:
    Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
     */
    public int checkingNumbersForValidity() {
        while (!scanner.hasNextInt()) {
            System.out.println("Некорректное число");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public int lengthForArray() {
        int arrLength;
        while (true) {
            System.out.print("Введите длину массива (просто целое число): ");
            arrLength = checkingNumbersForValidity();
            if (arrLength <= 0) {
                System.out.println("Длина массива должна быть больше 0");
                continue;
            }
            break;
        }
        return arrLength;
    }

    public int[] createAnArray() {
        int numeric;
        System.out.println("Вы создаёте массив: ");
        int arrLength = lengthForArray();
        int[] arr;
        while (true) {
            System.out.println("Выберите, как вы хотите создать массив:");
            System.out.println("1.В ручную задавая значение массива \n2.Автоматическая генерация значений массива");
            numeric = checkingNumbersForValidity();
            switch (numeric) {
                case 1:
                    arr = manualCreateArr(arrLength);
                    break;
                case 2:
                    arr = autoCreateArr(arrLength);
                    break;
                default:
                    System.out.print("Сделай выбор повторно: ");
                    continue;
            }
            break;
        }
        return arr;
    }

    public int[] manualCreateArr(int arrLength) {
        int[] arr = new int[arrLength];
        int check;
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                System.out.println("Введите значение для элемента под индексом = " + i);
                check = checkingNumbersForValidity();
                if (check < 0) {
                    System.out.println("Значение массива не может быть меньше 0");
                    continue;
                }
                break;
            }
            arr[i] = check;
        }
        return arr;
    }

    public int[] autoCreateArr(int arrLength) {
        int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        return arr;
    }

    /*
    Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
     */
    public void outputStraightAndBack() {
        int[] arr = createAnArray();
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        System.out.println("Вывод элементов в прямом порядке: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nВывод элементов в обратном порядке: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    /*
    Задача 2:
Найти минимальный-максимальный элементы и вывести в консоль.
     */
    public void minAndMaxValue() {
        int[] arr = createAnArray();
        int max = arr[0];
        int min = arr[0];
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        for (int i : arr) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        System.out.println("Минимальный элемент: " + min + "\nМаксимальный элемент: " + max);
    }

    /*
    Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.
     */
    public void minAndMaxIndex() {
        int[] arr = createAnArray();
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Индекс минимального элемента: " + minIndex + "\nИндекс максимального элемента: " + maxIndex);
    }

    /*
    Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
сообщение, что их нет.
     */
    public void zeroElementCounter() {
        int[] arr = createAnArray();
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        int count = 0;
        for (int i : arr) {
            if (i == 0) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Количество нулевых элементов: " + count);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }

    /*
    Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй и
предпоследний и т.д.
     */
    public void swapElements() {
        int[] arr = createAnArray();
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        int swap = 0;
        int swapIndex = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            swapIndex = arr.length - 1 - i;
            swap = arr[i];
            arr[i] = arr[swapIndex];
            arr[swapIndex] = swap;
        }
        System.out.println("Ваш развёрнутый массив: " + Arrays.toString(arr));
    }

    /*
    Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое следующее
число больше предыдущего).
     */
    public void arrayIncreasingOrNot() {
        int[] arr = createAnArray();
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        boolean itTrue = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                itTrue = false;
                break;
            }
        }
        if (itTrue) {
            System.out.println("Ваш массив идёт по возрастанию");
        } else {
            System.out.println("Ваш массив не имеет возрастающей последовательности");
        }
    }

    /*
    Задача *:
Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]
     */
    public int[] plusOne(int[] arr) {
        System.out.println("Ваш массив: " + Arrays.toString(arr));
        String buffer = "";
        for (int i : arr) {
            buffer += i;
        }
        int number = Integer.parseInt(buffer) + 1;
        buffer = String.valueOf(number);
        char[] bufferArr = buffer.toCharArray();
        int[] newArr = new int[bufferArr.length];
        for (int i = 0; i < arr.length; i++) {
            buffer = String.valueOf(bufferArr[i]);
            newArr[i] = Integer.parseInt(buffer);
        }
        return newArr;
    }
}
