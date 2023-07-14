package Controllers;

import Domen.Teachers;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teachers> {
    private final TeacherService dataService = new TeacherService();

    // Метод занесения учетелей в базу данных
    @Override
    public void create(String name, int age) {
        dataService.create(name, age);
        dataService.getSortByFIOTeachersList();
    }
    
}
