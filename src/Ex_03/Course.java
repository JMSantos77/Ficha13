package Ex_03;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static Ex_03.School.*;

public class Course {
    private String name;
    private boolean longTerm;
    private static ArrayList<CourseDiscipline> courseDisciplines;

    public Course(String name, boolean longTerm) {
        this.name = name;
        this.longTerm = longTerm;
        courseDisciplines = new ArrayList<>();
    }


    public static Course createCourse() {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira Nome do curso: ");
        String name = input.nextLine();

        System.out.println("Número de disciplinhas do curso: ");
        int nrOfDisciplines = input.nextInt();

        System.out.println("Da seguinte lista: ");
        for (Discipline discipline : School.getDisciplines()) {
            System.out.println("-" + discipline);
        }

        int count = 0;
        while (count < nrOfDisciplines) {

            System.out.println("Escolha disciplina a adicionar");
            String disciplineName = input.next();
            Discipline addDiscipline = null;

            for (Discipline discipline : School.getDisciplines()) {
                if (Objects.equals(discipline.getName(), disciplineName)) {
                    addDiscipline = discipline;
                }
            }

            System.out.println("Da seguinte lista: ");
            for (Teacher teachers : School.getTeachers()) {
                System.out.println("-" + teachers);
            }

            System.out.println("Escolha Professor para lecionar: ");
            String teacherName = input.next();
            Teacher addTeacher = null;

            for (Teacher teachers : School.getTeachers()) {
                if (Objects.equals(teachers.getName(), teacherName)) {
                    addTeacher = teachers;
                }
            }

            CourseDiscipline newCourseDiscipline = new CourseDiscipline(addDiscipline, addTeacher);

            courseDisciplines.add(newCourseDiscipline);

            count++;
        }

        System.out.print("Introduza Duração/Horas do Curso: ");
        int courseDuration = input.nextInt();
        boolean setBoolean;
        if (courseDuration <= 100) {
            setBoolean = false;
        } else {
            setBoolean = true;
        }

        return new Course(name, setBoolean);


    }



    /*
    public static void addCourseDiscipline(Discipline discipline, Teacher teacher) {
        CourseDiscipline newDiscipline = new CourseDiscipline(discipline, teacher);
        courseDisciplines.add(newDiscipline);
    }
     */
}
