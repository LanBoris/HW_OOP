
public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private Logger logger;
 
    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public String sum(int arg, int arg2, int arg3, int arg4) {
       logger.log(String.format("Первое комплексное число %d+%di\nВторое комплексное число %d+%di", arg, arg2, arg3, arg4));
       String result = oldCalc.sum(arg, arg2, arg3, arg4);
       logger.log(String.format("Вызова метода sum произошел"));
       return result;
    }

    @Override
    public String multi(int arg, int arg2, int arg3, int arg4) {
        logger.log(String.format("Первое комплексное число %d+%di\nВторое комплексное число %d+%di", arg, arg2, arg3, arg4));
        String result = oldCalc.multi(arg, arg2, arg3, arg4);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public String division(int arg, int arg2, int arg3, int arg4) {

       logger.log(String.format("Первое комплексное число %d+%di\nВторое комплексное число %d+%di", arg, arg2, arg3, arg4));
       String result = oldCalc.division(arg, arg2, arg3, arg4);
       logger.log(String.format("Вызова метода division произошел"));

       return result;
    }

    @Override
    public String getResult() {
        String result = oldCalc.getResult();
        logger.log(String.format("Получение результата = " + result));
        return result;
    }
    
}