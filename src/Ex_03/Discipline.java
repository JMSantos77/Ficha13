package Ex_03;

import Ex_03.Enums.TrainingArea;

import java.util.Scanner;

public class Discipline {
    private String name;
    private TrainingArea area;
    private int durationHours;

    public Discipline(String name, TrainingArea area, int durationHours) {
        this.name = name;
        this.area = area;
        this.durationHours = durationHours;
    }

    //Getters
    public String getName() {
        return name;
    }

    public TrainingArea getArea() {
        return area;
    }

    public int getDurationHours() {
        return durationHours;
    }

    //Methods
    public static Discipline createDiscipline() {
        Scanner input = new Scanner(System.in);

        System.out.println("** Criação de disciplina **");

        System.out.print("Insira o Nome: ");
        String name = input.next();

        System.out.println("Da seguinte lista: ");
        for (TrainingArea area : TrainingArea.values()) {
            System.out.println("- " + area);
        }

        System.out.print("Escolha a Área de Formação: ");
        TrainingArea area = TrainingArea.valueOf(input.next().toUpperCase());

        System.out.print("Insira a Duração/Horas: ");
        int durationHours = input.nextInt();

        Discipline newDiscipline = new Discipline(name, area, durationHours);

        return newDiscipline;

    }
}
