package Model;

import java.util.HashMap;
import java.util.Map;

import Controller.iGetModel;

public class HashModel implements iGetModel {

    private Map<Long,Student> students = new HashMap<>();
    
    public HashModel(Map<Long, Student> students) {
        this.students = students;
    }

    @Override
    public Map<Long,Student> getAllStudents() {
        return students;
    }

    @Override
    public void deleteStudent(Long id) {
        if (!students.containsKey(id)) {
            throw new IllegalArgumentException("Student with ID " + id + " does not exist.");
          }
          students.remove(id);
    }

    
    
}
