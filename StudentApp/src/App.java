import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Controllers.EmploeeController;
import Domen.AverageAge;
import Domen.Emploee;
import Domen.GroupComparator;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teachers;
import Domen.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {
        // Создание студентов
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
        Student s11 = new Student("Masha", 22, 231);
        Student s12 = new Student("Nikolai", 22, 342);

        // Создание общего списка студентов
        List<Student> listAllStudents = new ArrayList<>();
        listAllStudents.add(s1);
        listAllStudents.add(s2);
        listAllStudents.add(s3);
        listAllStudents.add(s4);
        listAllStudents.add(s5);
        listAllStudents.add(s6);
        listAllStudents.add(s7);
        listAllStudents.add(s8);
        listAllStudents.add(s9);
        listAllStudents.add(s10);
        listAllStudents.add(s11);
        listAllStudents.add(s12);

        // Создание первой группы студентов
        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s2);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s8);
        
        // Создание второй группы студентов
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s9);
        listStud1.add(s10);
        
        // Создание третьей группы студентов
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s3);
        listStud2.add(s6);
        listStud2.add(s7);
        listStud2.add(s11);
        listStud2.add(s12);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);

        StudentGroup group4660 = new StudentGroup(listStud1, 4660);

        StudentGroup group3445 = new StudentGroup(listStud2, 3445);

        // Создание потока из групп студентов
        List<StudentGroup> listStream = new ArrayList<>();
        listStream.add(group4580);
        listStream.add(group3445);
        listStream.add(group4660);
        StudentStream stream1 = new StudentStream(listStream, 1);
        System.out.println("\n" + "Students Stream 1: ");
        for(StudentGroup grp: stream1){
            System.out.println("\n" + "Group № " + grp.getIdGroup());
            for(Student std: grp){
                System.out.println(std);
            }
        }

        // Вывод отсортированного списка групп с помощью GroupComparator
        GroupComparator<StudentGroup> comGroup = new GroupComparator<>();
        Collections.sort(stream1.getStream(), comGroup);
        System.out.println("\n" + "Groups sorted by amount of students: ");
        for(StudentGroup grp: stream1){
            System.out.println("Group № " + grp.getIdGroup());
        }

        // Создание учетелей
        Teachers t1 = new Teachers("Ivan Ivanovich", 38, "Docent", 1001);
        Teachers t2 = new Teachers("Igor Borisovich", 55, "Professor", 1002);
        Teachers t3 = new Teachers("Boris Petrovich", 46, "Professor", 1003);
        Teachers t4 = new Teachers("Tamara Vasilievna", 52, "Docent", 1004);

        // Создание списка учетелей
        List<Teachers> listTeachers = new ArrayList<Teachers>();
        listTeachers.add(t1);
        listTeachers.add(t2);
        listTeachers.add(t3);
        listTeachers.add(t4);

        // Вывод списка учетелей отсортированного с помощью класса PersonComparator
        PersonComparator<Teachers> comTeach = new PersonComparator<>();
        Collections.sort(listTeachers, comTeach);
        System.out.println("\n" + "Teachers sorted by age: ");
        for (Teachers teach: listTeachers){
            System.out.println(teach);
        }
        System.out.println();

        // Поиск среднего возраста учетелей при помощи обобщеного класса AverageAge
        AverageAge<Teachers> avgTeachers = new AverageAge<>(listTeachers);
        System.out.println("Average age of teachers: " + avgTeachers.avgAge());

        // Поиск среднего возраста студентов при помощи обобщенного класса AverageAge
        AverageAge<Student> avgStudent = new AverageAge<>(listAllStudents);
        System.out.println("Average age of students: " + avgStudent.avgAge());
        
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