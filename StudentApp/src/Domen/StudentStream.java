package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{

    private List<StudentGroup> stream;
    private int idStream;

    public StudentStream(List<StudentGroup> stream, int idStream) {
        this.stream = stream;
        this.idStream = idStream;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public int getIdStream() {
        return idStream;
    }

    public void setIdStream(int idStream) {
        this.idStream = idStream;
    }
    
    @Override
    public String toString() {
        return "StudentStream [stream=" + stream + ", idStream=" + idStream + "]";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
       return new Iterator<StudentGroup>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter< stream.size()){
                return true;
            }
            else{
                return false;
            }            
        }

        @Override
        public StudentGroup next() {            
            return stream.get(counter++);
        }
        
       };
    }

}
