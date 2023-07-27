package View;

import java.util.Map;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{
    
    public void printAllStudents(Map<Long,Student> students){
        System.out.println("Students list: ");
        System.out.println(students);
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }

    @Override
    public Long getStudentIdToDelete(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        Long id = Long.parseLong(input.nextLine());
        return id;
    }

}
