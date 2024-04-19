package Ex_03;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static Ex_03.School.*;

public class Course {
    private String name;
    private boolean longTerm;
    private ArrayList<CourseDiscipline> courseDisciplines;

    //Getters
    public String getName() {
        return name;
    }

    public ArrayList<CourseDiscipline> getCourseDisciplines() {
        return courseDisciplines;
    }

    public Course() {
        Scanner input = new Scanner(System.in);
        System.out.println("** Criação de Novo Curso **");

        System.out.print("Insira Nome do curso: ");
        this.name = input.nextLine();

        System.out.print("Número de disciplinas do curso: ");
        int nrOfDisciplines = input.nextInt();

        System.out.println("Da seguinte lista: ");
        for (Discipline discipline : School.getDisciplines()) {
            System.out.println("- " + discipline.getName());
        }

        int count = 0;
        this.courseDisciplines = new ArrayList<>(); //Inicializo aqui o ArrayList para evitar NullPointerException

        while (count < nrOfDisciplines) {
            System.out.print("Escolha disciplina a adicionar: ");
            String disciplineName = input.next();
            Discipline addDiscipline = null;

            for (Discipline discipline : School.getDisciplines()) {
                if (Objects.equals(discipline.getName().toLowerCase(), disciplineName.toLowerCase())) {
                    addDiscipline = discipline;
                }
            }

            System.out.println("Da seguinte lista: ");
            for (Teacher teachers : School.getTeachers()) {
                System.out.println("- " + teachers.getName());
            }

            System.out.print("Escolha Professor para lecionar: ");
            String teacherName = input.next();
            Teacher addTeacher = null;

            for (Teacher teachers : School.getTeachers()) {
                if (Objects.equals(teachers.getName().toLowerCase(), teacherName.toLowerCase())) {
                    addTeacher = teachers;
                }
            }

            CourseDiscipline newCourseDiscipline = new CourseDiscipline(addDiscipline, addTeacher);

            courseDisciplines.add(newCourseDiscipline);

            count++;
        }

        System.out.print("Introduza Duração/Horas do Curso: ");
        int courseDuration = input.nextInt();

        if (courseDuration <= 100) {
            this.longTerm = false;
        } else {
            this.longTerm = true;
        }
    }



    /*
    public static void addCourseDiscipline(Discipline discipline, Teacher teacher) {
        CourseDiscipline newDiscipline = new CourseDiscipline(discipline, teacher);
        courseDisciplines.add(newDiscipline);
    }
     */
}
