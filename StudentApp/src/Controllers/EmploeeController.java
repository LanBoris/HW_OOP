package Controllers;

import Domen.Emploee;
import Services.EmploeeService;

public class EmploeeController implements iPersonController<Emploee> {
    private final EmploeeService empService = new EmploeeService();

    @Override
    public void create(String name, int age) {
        empService.create(name, age);
    }

    public static <T extends Emploee> void paySalary(T person){
        System.out.println(person.getName() + " get salary 10.000");
    }
}
