package Ex_03;

import Ex_03.Enums.TrainingArea;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<TrainingArea> trainingArea;
    private int academicLevel;

    public Teacher(String name, int yearOfBirth, String email, String phone, ArrayList<TrainingArea> trainingArea, int academicLevel) {
        super(name, yearOfBirth, email, phone);
        this.trainingArea = trainingArea;
        this.academicLevel = academicLevel;
    }
    //Getters


    @Override
    public void jobTitle() {

    }

    @Override
    public void printTimetable() {

    }

    public String personDetails() {
        return super.personDetails() +
                " | Área de Formação: " + trainingArea +
                " | Nível Académico: " + academicLevel;
    }
}
