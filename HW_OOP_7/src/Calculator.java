
public final class Calculator implements iCalculable {

    private String result;

    public Calculator() {
        this.result = result;
    }

    // Метод сложения комплексных чисел
    @Override
    public String sum(int arg, int arg2, int arg3, int arg4) {
        int result1 = arg + arg3;
        int result2 = arg2 + arg4;
        result = result1 + "+" + result2 + "i";
        return result1 + "+" + result2 + "i";
    }

    // Метод умножения комплексных чисел
    @Override
    public String multi(int arg, int arg2, int arg3, int arg4) {
        int result1 = arg*arg3 - arg2*arg4;
        int result2 = arg2*arg3 + arg*arg4;
        result = result1 + "+" + result2 + "i";
        return result1 + "+" + result2 + "i";
    }

    // Метод деления комплексных чисел
    @Override
    public String division(int arg, int arg2, int arg3, int arg4) {
        double result1 = (arg*arg3 + arg2*arg4)/(arg3*arg3 + arg4*arg4);
        double result2 = (arg2*arg3 - arg*arg4)/(arg3*arg3 + arg4*arg4);
        result = result1 + "+" + result2 + "i";
        return result1 + "+" + result2 + "i";
    }

    // Метод получения результата
    @Override
    public String getResult() {
        return result;
    }

}
