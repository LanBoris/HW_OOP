package Controller;

import java.util.Map;

import Model.Student;

public interface iGetModel {
    
    // Метод для вывода всех студентов
    public Map<Long,Student> getAllStudents();

    // Метод для удаления студента по ID
    public void deleteStudent(Long id);
}
