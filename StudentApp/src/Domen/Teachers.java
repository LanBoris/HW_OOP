package Domen;

public class Teachers extends Person {
    
    protected int idTeacher;
    protected String degree;

    public Teachers(String name, int age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    
}
