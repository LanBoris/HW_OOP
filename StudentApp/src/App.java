import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teachers;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        

        // StudentGroup group4580 = new StudentGroup(listStud, 4580);
        // System.out.println(group4580);

        // for(Student std : group4580)
        // {
        //     System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup())
        // {
        //     System.out.println(std);
        // }

        PersonComparator<Student> comStud = new PersonComparator<>();
        comStud.compare(s1, s2);

        Teachers t1 = new Teachers("Иван", 25, "Docent");
        Teachers t2 = new Teachers("Игорь", 23, "Professor");

        PersonComparator<Teachers> comTch = new PersonComparator<>();
        comTch.compare(t1, t2);

        PersonComparator<Person> comPer = new PersonComparator<>();
        comPer.compare(s1, t2);

        Emploee e1 = new Emploee("Fedorich", 60);


        EmploeeController.paySalary(e1); // усли указать что метод static то можно не создавать экземпляр класса а прямо обращаться к нему
        
    }
}