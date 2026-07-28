package homework_8;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Мур-мур");
    }

    @Override
    public void eat(String food) {
        if(food.equals("Meat")){
            System.out.println("Люблю есть мясо");
        }else {
            System.out.println("Недоволен");
        }
    }
}
