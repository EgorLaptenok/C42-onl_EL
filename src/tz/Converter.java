package tz;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        int chose;
        int number;
        boolean flagA = true;
        Scanner scanner = new Scanner(System.in);
        while (flagA){
            System.out.println("Выберите способ: \nМассив: 1\nРекурсия: 2");
            chose = scanner.nextInt();
            System.out.println("Введите десятичное число");
            number = scanner.nextInt();
            String readF = "";
            if(chose == 1){
                try (FileReader fr = new FileReader( "src/tz/count")) {
                    int i;
                    while ((i = fr.read()) != -1) {
                        readF += (char) i;
                    }
                } catch (Exception e) {
                    e.printStackTrace() ;
                }
                System.out.println();
                System.out.println("Способ перевода: Массив");
                try (FileWriter fw = new FileWriter( "src/tz/count")) {
                    fw.write(readF + "\nРезультат: " + convertArr(number));
                    fw.flush();

                } catch (Exception e) {
                    e.printStackTrace() ;
                }
                flagA = false;
            }else if (chose == 2){
                System.out.println("Способ перевода: Рекурсия");
                convertRecursion(number);
            }else{
                System.out.println("Некорректный выбор");
            }
        }
    }

    private static void convertRecursion(int number){

    }
    public static String convertArr(int number){
        if(number %2 != 0){
            System.out.println("Введите число повторно: ");
        }
        int size = 0;
        int flag = number;
        while (flag > 0){
            size++;
            flag /= 2;
        }
        int[] convertArr = new int[size];
        int numberAfDivision;
        for (int i = 0; i<size; i++){
            numberAfDivision = number / 2;
            int remainder =  number % 2;
            System.out.println(number + " / " + 2 + " = " + numberAfDivision + " остаток " + remainder);
            number = numberAfDivision;
            convertArr[i] = remainder;

        }
        String trueConvertArr = "";
        for (int i = convertArr.length - 1, y = 0; i >=0; i--, y++){
            trueConvertArr += convertArr[i];
        }
        System.out.println("Результат: " + trueConvertArr);

        return trueConvertArr;
    }
}
