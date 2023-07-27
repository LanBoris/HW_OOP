import java.util.HashMap;
import java.util.Map;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HashModel;
import Model.Student;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

       Map<Long,Student> students = new HashMap<>();
       Student s1 = new Student("Ivan",  21, 101L);
       Student s2 = new Student("Boris",  22, 102L);
       Student s3 = new Student("Dasha", 22, 103L);
       Student s4 = new Student("Georgiy", 23, 104L);
       Student s5 = new Student("Aglaya",  25, 105L);
       Student s6 = new Student("Arsenii",  23, 106L);
       Student s7 = new Student("Bob", 24, 107L);
       students.put(s1.getId(),s1);
       students.put(s2.getId(),s2);
       students.put(s3.getId(),s3);
       students.put(s4.getId(),s4);
       students.put(s5.getId(),s5);
       students.put(s6.getId(),s6);
       students.put(s7.getId(),s7);

       iGetModel model = new HashModel(students);
       iGetView view = new ViewEng();

       Controller control = new Controller(model, view);

       control.run();

    }
}