package Ex_03;

import static Ex_03.Course.*;

public class Main {
    public static void main(String[] args) {

        School filipaDeVilhena = new School("Filipa de Vilhena", "Porto", 1000);


        Discipline nova = Discipline.createDiscipline();
        filipaDeVilhena.addDiscipline(nova);

        Teacher teacherNovo = School.createTeacher();
        filipaDeVilhena.addTeacher(teacherNovo);

        Course novo = new Course();
        filipaDeVilhena.addCourse(novo);

        Student studentNovo = new Student();
        filipaDeVilhena.addStudent(studentNovo);






    }
}
