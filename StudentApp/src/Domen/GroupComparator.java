package Domen;

import java.util.Comparator;

public class GroupComparator<T extends StudentGroup> implements Comparator<T> {

    // Сравнение групп по количеству студентов
    @Override
    public int compare(T o1, T o2) {
        int e1 = o1.getGroup().size();
        int e2 = o2.getGroup().size();
        if (e1 == e2){
            return 0;
        }
        if (e1 > e2){
            return 1;
        }
        else {
            return -1;
        }
    }
    
}
