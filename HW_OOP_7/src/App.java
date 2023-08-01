public class App {
    public static void main(String[] args) throws Exception {
        iCalculable calculator = new Calculator();
        iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());
        ViewCalculator view = new ViewCalculator(newCalcLog);
        view.run();
    }
}
