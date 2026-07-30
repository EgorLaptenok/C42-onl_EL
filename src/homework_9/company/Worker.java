package homework_9.company;

public class Worker implements Employee{
    String namePosition = "Рабочий";
    @Override
    public String getPositions(){
        return namePosition;
    }
}
