package Ex_03;

public class CourseDiscipline {
    private Discipline discipline;
    private Teacher teacher;

    public CourseDiscipline(Discipline discipline, Teacher teacher) {
        this.discipline = discipline;
        this.teacher = teacher;
    }

    //Getters
    public Discipline getDiscipline() {
        return discipline;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    //Setters
    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
