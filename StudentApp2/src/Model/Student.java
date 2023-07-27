package Model;

public class Student extends Person implements Comparable<Student> {

    private Long id;

    public Student(String name, int age, Long id) {
        super(name, age);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " Student {Name= " + super.getName() + ", Age= " + super.getAge() + "}";
    }

    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName() + " - " + o.getName());
        if (super.getAge() == o.getAge()) {
            if (id == o.id)
                return 0;
            if (id > o.id)
                return 1;
            else
                return -1;
            // return 0;
        }

        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }

}