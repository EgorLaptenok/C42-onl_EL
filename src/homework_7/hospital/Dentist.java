package homework_7.hospital;

public class Dentist extends Doctor{

    public Dentist(String jobTitle) {
        super(jobTitle);
    }

    @Override
    public String treatment() {
        return "Пить таблетки от боли в зубах";
    }
}
