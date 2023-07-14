package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Student;

public class StudentService implements iPersonService<Student> {
    // Поля класса
    private int count;
    private List<Student> students;

    // Конструктор
    public StudentService(){
        this.students = new ArrayList<Student>();
    }

    @Override
    public List<Student> getAll(){
        return students;
    }

    @Override
    public void create(String name, int age){
        Student per = new Student(name, age, count);
        count++;
        students.add(per);
    }

    public List<Student> getSortByFIOStudList(){
        List<Student> newStudList = new ArrayList<Student>(students);
        newStudList.sort(new PersonComparator<>());
        return newStudList;
    }
}
