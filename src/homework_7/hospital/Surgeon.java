package homework_7.hospital;

public class Surgeon extends Doctor{

    public Surgeon(String jobTitle) {
        super(jobTitle);
    }

    @Override
    public String treatment() {
        return "Мазать мазь";
    }
}
