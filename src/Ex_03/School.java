package Ex_03;

import java.util.ArrayList;

public class School {
    private String name;
    private String location;
    private int maxStudents;
    private static ArrayList<Teacher> teachers;
    private static ArrayList<Discipline> disciplines;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    public School(String name, String location, int maxStudents) {
        this.name = name;
        this.location = location;
        this.maxStudents = maxStudents;
        this.teachers = new ArrayList<>();
        disciplines = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public static ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    //Methods
    public void addDiscipline(Discipline discipline){
        disciplines.add(discipline);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
}
