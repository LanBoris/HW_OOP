package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teachers;

public class TeacherService implements iPersonService<Teachers> {
    // Поля класса
    private int count;
    private List<Teachers> teachers;

    // Конструктор
    public TeacherService() {
        this.teachers = new ArrayList<Teachers>();
    }

    @Override
    public List<Teachers> getAll() {
        return teachers;
    }

    // Метод занесения учетелей в список
    @Override
    public void create(String name, int age) {
        Teachers per = new Teachers(name, age, "", count);
        count++;
        teachers.add(per);
    }
    
    //Метод сортировки списка учетелей
    public List<Teachers> getSortByFIOTeachersList(){
        List<Teachers> newTeachersList = new ArrayList<Teachers>(teachers);
        newTeachersList.sort(new PersonComparator<>());
        return newTeachersList;
    }
}
