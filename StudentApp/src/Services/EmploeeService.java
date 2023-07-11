package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Emploee;

public class EmploeeService {
    private int count;
    private List<Emploee> emploees;

    public EmploeeService(){
        this.emploees = new ArrayList<Emploee>();
    }

    public void create(String name, int age) {
    }
}
