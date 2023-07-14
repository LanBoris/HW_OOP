package Domen;

public class Teachers extends Person {
    // Поля класса
    protected int idTeacher;
    protected String degree;

    // Конструктор
    public Teachers(String name, int age, String degree, int idTeacher) {
        super(name, age);
        this.degree = degree;
        this.idTeacher = idTeacher;
    }

    
}
