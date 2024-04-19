package Ex_03;
import static Ex_03.Course.*;

public class Main {
    public static void main(String[] args) {



        School filipaDeVilhena = new School("Filipa de Vilhena", "Porto", 1000);

        Discipline nova = Discipline.createDiscipline();

        filipaDeVilhena.addDiscipline(nova);

        Teacher teacherNovo = new Teacher("Miguel",1977, "hohoho@ho.com", "987654321", null, 5);
        filipaDeVilhena.addTeacher(teacherNovo);

        //Course novo = new Course("AAA", true);
        //novo.createCourse();

        Course novo = Course.createCourse();
    }
}
