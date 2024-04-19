package Ex_03;

public abstract class Person {
    protected String name;
    protected int yearOfBirth;
    protected String email;
    protected String phone;

    public Person(String name, int yearOfBirth, String email, String phone) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
    }
    //Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public abstract void jobTitle();

    public abstract void printTimetable();

    public String personDetails() {
        return "Nome: " + name +
                " | Ano de Nascimento: " + yearOfBirth +
                " | Email: " + email +
                " | Telefone: " + phone;
    }
}
