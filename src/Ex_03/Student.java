package Ex_03;

import Ex_03.Enums.Curso;

import java.util.Objects;
import java.util.Scanner;

public class Student extends Person {
    private Course course;
    private double gradeAverage;
    private static String[][] gradeSheet;

    @Override
    public void jobTitle() {

    }

    @Override
    public void printTimetable() {

    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setGradeAverage(double gradeAverage) {
        this.gradeAverage = gradeAverage;
    }

    public static void setGradeSheet(String[][] gradeSheet) {
        Student.gradeSheet = gradeSheet;
    }

    public Student() {
        super("", 0, "email", "phone");

        Scanner input = new Scanner(System.in);

        System.out.println("** Criação de Novo Aluno **");

        System.out.print("Insira o Nome: ");
        this.setName(input.next());

        System.out.print("Insira o Ano de Nascimento: ");
        this.setYearOfBirth(input.nextInt());

        System.out.print("Insira o Email: ");
        this.setEmail(input.next());

        System.out.print("Insira o Telefone: ");
        this.setPhone(input.next());


        //Add Course
        System.out.print("Da seguinte lista: ");
        for (Course courses : School.getCourses()) {
            System.out.println("- " + courses.getName());
        }

        System.out.print("Escolha o Curso: ");
        String courseName = input.next();

        Course addCourse = null;
        for (Course courses : School.getCourses()) {
            if (Objects.equals(courses.getName().toLowerCase(), courseName.toLowerCase())) {
                addCourse = courses;
            }
        }

        //this.setCourse(addCourse);
        this.course = addCourse;

        //Calculate Average
        this.gradeSheet = new String[addCourse.getCourseDisciplines().size()][2];

        this.gradeAverage = 0;


    }

    public double calculateAverage() {
        double sumGrades = 0, average = 0;

        for (String[] line : gradeSheet) {
            sumGrades += Double.parseDouble(line[1]);
        }

        average = sumGrades / gradeSheet.length;
        return average;
    }
}
