import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teachers;
import Domen.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Ivan", 25, 121);
        Student s2 = new Student("Igor", 23, 301);
        Student s3 = new Student("Ivan", 22, 121);
        Student s4 = new Student("Igor",  23, 444);
        Student s5 = new Student("Dasha",  23, 171);
        Student s6 = new Student("Elena",  22, 104);
        Student s7 = new Student("Jane", 22, 132);
        Student s8 = new Student("Boris", 23, 775);
        Student s9 = new Student("Sasha", 25, 554);
        Student s10 = new Student("Kate", 25, 784);
        
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s2);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s8);
        
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s9);
        listStud1.add(s10);
        
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s3);
        listStud2.add(s6);
        listStud2.add(s7);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);
        System.out.println("\n" + "Group № 4580: ");
        for(Student std : group4580)
        {
            System.out.println(std);
        }

        StudentGroup group4660 = new StudentGroup(listStud1, 4660);
        System.out.println("\n" + "Group № 4660:");
        for(Student std : group4660)
        {
            System.out.println(std);
        }

        StudentGroup group3445 = new StudentGroup(listStud2, 3445);
        System.out.println("\n" + "Group № 3445: ");
        for(Student std : group3445)
        {
            System.out.println(std);
        }

        List<StudentGroup> listStream = new ArrayList<>();
        listStream.add(group4580);
        listStream.add(group3445);
        listStream.add(group4660);
        StudentStream stream1 = new StudentStream(listStream, 1);
        System.out.println("\n" + "Student Stream 1: ");
        for(StudentGroup grp: stream1){
            System.out.println("\n" + "Group № " + grp.getIdGroup());
            for(Student std: grp){
                System.out.println(std);
            }
        }

        // PersonComparator<Student> comStud = new PersonComparator<>();
        // comStud.compare(s1, s2);

        // Teachers t1 = new Teachers("Ivan Ivanovich", 25, "Docent");
        // Teachers t2 = new Teachers("Igor Borisovich", 23, "Professor");

        // PersonComparator<Teachers> comTch = new PersonComparator<>();
        // comTch.compare(t1, t2);

        // PersonComparator<Person> comPer = new PersonComparator<>();
        // comPer.compare(s1, t2);

        // Emploee e1 = new Emploee("Fedorich", 60);


        // EmploeeController.paySalary(e1); // усли указать что метод static то можно не создавать экземпляр класса а прямо обращаться к нему
        
    }
}