package test;

import static org.junit.Assert.*;

import org.junit.Test;

import calc.Calc;

public class TestNumbers {

    @Test
    public void test() {
        String result = Calc.parseExpression("10+10");
        assertEquals("20", result);

        String resultBinary = Calc.parseExpression("1010(2)+101(2)");
        assertEquals("1111(2)", resultBinary);
    }

}
