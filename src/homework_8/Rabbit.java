package homework_8;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Фр-фр-фр");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Grass")){
            System.out.println("Люблю есть траву");
        }else {
            System.out.println("Недоволен");
        }
    }
}
