import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LambdaExpressionTest {

    @Test
    public void lambda() {
        LambdaExpression lambdaExpression = new LambdaExpression();
        int actual = lambdaExpression.calculateSum.calcSum(0, 0);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }
}