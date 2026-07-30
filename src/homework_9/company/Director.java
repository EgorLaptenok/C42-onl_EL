package homework_9.company;

public class Director implements Employee{
    String namePosition = "Директор";
    @Override
    public String getPositions() {
        return namePosition;
    }
}
