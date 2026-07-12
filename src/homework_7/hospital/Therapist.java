package homework_7.hospital;

public class Therapist extends Doctor{

    public Therapist(String jobTitle) {
        super(jobTitle);
    }

    public String listen(String complaintAbout){
        if (complaintAbout.equals("Кости")){
            return "Хирург";
        } else if (complaintAbout.equals("Зубы")) {
            return "Дантист";
        }else {
            return "Терапевт";
        }
    }

    @Override
    public String treatment() {
        return "Пить таблетки от головы";
    }
}
