package Controller;

import java.util.Map;

import Model.Student;

public interface iGetView {
    // Метод печатает список всех студентов
    public void printAllStudents(Map<Long,Student> students);

    // Метод для запроса ввода пользователя
    String prompt(String msg);

    // Метод для получения id студента, которого нужно удалить.
    Long getStudentIdToDelete(String msg);
}
