package SpeedCalc;

public class Bus extends Vehicle {
    private String name;

    public Bus(int maxSpeed, String type, String name) {
        super(maxSpeed, type);
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
}
