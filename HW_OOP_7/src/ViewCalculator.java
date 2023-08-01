import java.util.Scanner;

public class ViewCalculator {

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        System.out.println("Добро пожаловать в калькулятор комплексных чисел.");
        while (true) {
            while (true) {
                String cmd = prompt("Какую операцию будем выполнять (*, +, /, =): ");
                if (cmd.equals("*")) {
                    System.out.println("Введите первое комплексное число");
                    int arg = promptInt("Введите вещественную часть: ");
                    int arg2 = promptInt("Введите вещественное число мнимой части: ");
                    System.out.println("Введите второе комплексное число:");
                    int arg3 = promptInt("Введите вещественную часть: ");
                    int arg4 = promptInt("ВВедите вещественное число мнимой части: ");
                    calculator.multi(arg, arg2, arg3, arg4);
                    continue;
                }
                if (cmd.equals("+")) {
                    System.out.println("Введите первое комплексное число");
                    int arg = promptInt("Введите вещественную часть: ");
                    int arg2 = promptInt("Введите вещественное число мнимой части: ");
                    System.out.println("Введите второе комплексное число:");
                    int arg3 = promptInt("Введите вещественную часть: ");
                    int arg4 = promptInt("ВВедите вещественное число мнимой части: ");
                    calculator.sum(arg, arg2, arg3, arg4);
                    continue;
                }
                if (cmd.equals("/")){
                    System.out.println("Введите первое комплексное число");
                    int arg = promptInt("Введите вещественную часть: ");
                    int arg2 = promptInt("Введите вещественное число мнимой части: ");
                    System.out.println("Введите второе комплексное число:");
                    int arg3 = promptInt("Введите вещественную часть: ");
                    int arg4 = promptInt("ВВедите вещественное число мнимой части: ");
                    calculator.division(arg, arg2, arg3, arg4);
                    continue;
                }
                if (cmd.equals("=")) {
                    String result = calculator.getResult();
                    System.out.println("Результат = " + result + "\n");
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine().toUpperCase();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }

}