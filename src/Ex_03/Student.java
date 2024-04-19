package Ex_03;

import Ex_03.Enums.Curso;

public class Student extends Person {
    private Curso curso;
    private double gradeAverage;
    private String[][] gradeSheet;

    public Student(String name, int yearOfBirth, String email, String phone, Curso curso, double gradeAverage, String[][] gradeSheet) {
        super(name, yearOfBirth, email, phone);
        this.curso = curso;
        this.gradeAverage = gradeAverage;
        this.gradeSheet = gradeSheet;
    }

    @Override
    public void jobTitle() {

    }

    @Override
    public void printTimetable() {

    }
}
