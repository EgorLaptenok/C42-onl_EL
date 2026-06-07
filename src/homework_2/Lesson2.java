package homework_2;

/*

 */

public class Lesson2 {
    public static void main(String[] args) {
        Lesson2 lesson2 = new Lesson2();
        //taskOne
        int a = lesson2.taskOne(3, 6);
        System.out.println(a);
        //taskTwo
        System.out.println(lesson2.taskTwo(45));
        //taskThree
        System.out.println(lesson2.taskThree(342));
        //taskFour
        System.out.println(lesson2.taskFour(1.15));
        //taskFive
        System.out.println(lesson2.taskFive(21, 8));
        //taskSix
        lesson2.taskSix(3, 4);
    }

    /*

Задача 1:
Написать приложение, которое будет вычислять и выводить значение по формуле:
a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
     */
    public int taskOne(int b, int c) {
        return 4 * (b + c - 1) / 2;
    }

    /*
    Задача 2:
В переменной n хранится двузначное число. Создайте программу, вычисляющую и
выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
(2+6).
     */
    public String taskTwo(int n) {
        int a = n % 10;
        int b = n / 10;
        return "n =" + n + ", в результате мы получили: " + (b + a) + "(" + b + "+" + a + ")";
    }

    /*
    Задача 3:
В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
9 (1+2+6).
     */
    public String taskThree(int n) {
        int a = (n % 100) % 10;
        int b = (n / 10) % 10;
        int c = n / 100;
        return "n =" + n + ", в результате мы получили: " + (c + b + a) + "(" + c + "+" + b + "+" + a + ")";
    }

    /*
    Задача 4:
В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
программу, округляющую число n до ближайшего целого и выводящую результат на
экран.
     */
    public int taskFour(double n) {
        return ((int) ((n - (int) n) * 10) >= 5) ? (int) n + 1: (int) n;
    }

    /*
    Задача 5:
В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
на экран результат деления q на w с остатком. Пример вывода программы (для случая,
когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
     */
    public String taskFive(int q, int w){
        return  q + " / " + w + " = " + (q / w) + " и " + (q % w) + " в остатке";
    }

    /*
    Задача *:
Написать программу которая будет менять местами значение целочисленных
переменных. Пример:
int a = 1; int b = 2;
//код (ваше решение)
sout(a); //выведет 2
sout(b); //выведет 1
Усовершенствовать программу, использовать только 2 входные переменные (a,b)
     */
    public void taskSix(int a, int b){
        System.out.println("int a = " + a + "\n" + "int b = " + b);
        System.out.println("reverse");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("sout(a) = " + a + "\n" + "sout(b) = " + b);

    }
}
