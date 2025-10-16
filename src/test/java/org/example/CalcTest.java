package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    @Test
    public void testSubtraction() {
        // 故意设置错误断言（例如预期结果为2，但假设Calc.subtract未实现或返回错误值）
        assertEquals(2, c.subtract(4, 2));
    }

}
