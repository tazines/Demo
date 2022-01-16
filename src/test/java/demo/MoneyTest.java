package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    @Test
    public void testAddCanadians(){
        Money m1 = new Money(22,"CAD");
        Money m2 = new Money(28,"CAD");

        Money expected = new Money(50,"CAD");

        assertEquals(expected,m1.add(m2));
    }
}
