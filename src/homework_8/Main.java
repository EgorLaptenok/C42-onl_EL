package homework_8;

public class Main {
    /**
     * <p>Задача 1:</p>
     * Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
     * Переопределить методы voice(), eat(String food) чтобы они выводили верную
     * информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
     * Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
     * туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
     * или другую строку то он будет недоволен.
     * <p>Задача *:</p>
     * Написать такой конструктор, который запретит создание объекта класса Dog в других
     * классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
     * обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
     * способа.
     */
    public static void main(String[] args) {
        Animal rabbit = new Rabbit();
        Animal dog = new Dog();
        Animal tiger = new Tiger();

        System.out.println("___rabbit___");
        rabbit.eat("Meat");
        rabbit.eat("Grass");
        rabbit.voice();
        System.out.println("___dog___");
        dog.eat("Grass");
        dog.voice();
        System.out.println("___tiger___");
        tiger.eat("Meat");
        tiger.voice();
    }
}
