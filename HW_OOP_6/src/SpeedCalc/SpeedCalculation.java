package SpeedCalc;

public class SpeedCalculation {

    public double calculateAllowedSpeedCar(Car car){
        return car.getMaxSpeed()*0.8;
    }

    public double calculateAllowedSpeedBus(Bus bus){
        return bus.getMaxSpeed()*0.6;
    }
}
