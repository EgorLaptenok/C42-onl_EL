package homework_7;

import homework_7.hospital.*;

public class Main {
    /*
    Задача 1:
Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
терапевта создать метод, который будет назначать врача пациенту согласно плану
лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
лечить.
     */
    public static void main(String[] args) {
        Doctor dentist = new Dentist("Дантист");
        Doctor surgeon = new Surgeon("Хирург");
        Therapist therapist = new Therapist("Терапевт");
        Patient[] patients = new Patient[4];
        patients[0] = new Patient("Maksim", "Кости");
        patients[1] = new Patient("Dasha", "Зубы");
        patients[2] = new Patient("Vadim", "Не понятно");
        patients[3] = new Patient("Stas", "Плохое самочувствие");

        for (Patient patient : patients) {
            System.out.println("_________________");
            switch (therapist.listen(patient.getComplaintAbout())) {
                case "Хирург":
                    patient.setDoctor(surgeon.getJobTitle());
                    patient.setCourseTreatment(surgeon.treatment());
                    break;
                case "Дантист":
                    patient.setDoctor(dentist.getJobTitle());
                    patient.setCourseTreatment(dentist.treatment());
                    break;
                default:
                    patient.setDoctor(therapist.getJobTitle());
                    patient.setCourseTreatment(therapist.treatment());
                    break;
            }
            System.out.println("Пациенту: " + patient.getName() + "\nНазначенный доктор: " + patient.getDoctor());
            System.out.println("План лечения: " + patient.getCourseTreatment());

        }
    }
}
