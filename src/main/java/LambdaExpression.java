import java.util.logging.Logger;

public class LambdaExpression {
    private static Logger logger = Logger.getLogger(LambdaExpression.class.getName());

    CalculateSum calculateSum = new CalculateSum() {
        @Override
        public int calcSum(int a, int b) {
            logger.info("anonime class is working");
            System.out.println(a + b);
            return a + b;
        }
    };

    void lambda() {
        CalculateSum calculateSumLambda = (a, b) -> a + b;
        logger.info("lambda expression is working");
        System.out.println(calculateSumLambda.calcSum(10, 15));
    }


}

