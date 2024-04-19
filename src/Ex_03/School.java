package Ex_03;

import Ex_03.Enums.TrainingArea;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private String name;
    private String location;
    private int maxStudents;
    private static ArrayList<Teacher> teachers;
    private static ArrayList<Discipline> disciplines;
    private static ArrayList<Course> courses;
    private ArrayList<Student> students;

    public School(String name, String location, int maxStudents) {
        this.name = name;
        this.location = location;
        this.maxStudents = maxStudents;
        teachers = new ArrayList<>();
        disciplines = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public static ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    //Methods
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addDiscipline(Discipline discipline) {
        disciplines.add(discipline);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public static Teacher createTeacher() {
        Scanner input = new Scanner(System.in);

        System.out.println("** Criação de Novo Professor **");

        System.out.print("Insira o Nome: ");
        String name = input.next();

        System.out.print("Insira o Ano de Nascimento: ");
        int yearOfBirth = input.nextInt();

        System.out.print("Insira o Email: ");
        String email = input.next();

        System.out.print("Insira o Telefone: ");
        String phone = input.next();

        System.out.println("Da seguinte lista: ");
        for (TrainingArea area : TrainingArea.values()) {
            System.out.println("- " + area);
        }

        ArrayList<TrainingArea> trainingAreas = new ArrayList<>();

        int endCicle = 0;
        do {
            System.out.print("Escolha a(s) Área(s) de Formação (0 para acabar): ");
            TrainingArea area = TrainingArea.valueOf(input.next().toUpperCase());

            trainingAreas.add(area);

            System.out.println("Deseja acabar?");
            endCicle = input.nextInt();
        } while (endCicle != 0);

        System.out.print("Insira o Nível Académico: ");
        int academicLevel = input.nextInt();

        Teacher newTeacher = new Teacher(name, yearOfBirth, email, phone, trainingAreas, academicLevel);

        return newTeacher;
    }


}
