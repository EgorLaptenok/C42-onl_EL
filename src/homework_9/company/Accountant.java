package homework_9.company;

public class Accountant implements Employee{
    String namePositions = "Бухгалтер";
    @Override
    public String getPositions() {
        return namePositions;
    }
}
