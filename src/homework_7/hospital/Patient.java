package homework_7.hospital;

public class Patient {
    String name;
    private String courseTreatment;
    String complaintAbout;
    String doctor;

    public Patient(String name, String complaintAbout){
        this.name = name;
        this.complaintAbout = complaintAbout;
    }
    public void setCourseTreatment(String courseTreatment){
        this.courseTreatment = courseTreatment;
    }
    public String getCourseTreatment(){
        return courseTreatment;
    }
    public void setDoctor(String doctor){
        this.doctor = doctor;
    }
    public String getDoctor(){
        return doctor;
    }
    public String getComplaintAbout(){
        return complaintAbout;
    }
    public String getName(){
        return name;
    }


}
