package Domen;

import java.util.List;

public class AverageAge<T extends Person> {
    // Поля класса
    private List<T> list;
    public double avgAge;

    // Конструктор
    public AverageAge(List<T> list) {
        this.list = list;
    }

    // Метод поиска среднего возраста
    public double avgAge(){
        double sumAges = 0;
        for(T person: list){
            sumAges += person.getAge();
        }
        avgAge = sumAges/list.size();
        return avgAge;
    }
    
}
