package homework_9;

import homework_9.company.Accountant;
import homework_9.company.Director;
import homework_9.company.Employee;
import homework_9.company.Worker;
import homework_9.geometry.Circle;

import java.util.ArrayList;

/**
 * <p>Задача 1:<p/>
 * Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
 * который печатает название должности и имплементировать этот метод в созданные
 * классы.
 * <p>Задача 2:<p/>
 * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
 * функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
 * абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
 * периметра всех фигур в массиве.
 */

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        ArrayList<Employee> company = new ArrayList<>();
        company.add(new Director());
        company.add(new Worker());
        company.add(new Accountant());
        for (Employee namePosition: company){
            System.out.println(namePosition.getPositions());
        }
        //Задача 2:
        Circle circle = new Circle(10);
        circle.setPerimeter();
        System.out.println(circle.getPerimeter());
    }

}
