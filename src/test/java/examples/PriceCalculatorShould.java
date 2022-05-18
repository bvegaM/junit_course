package examples;

import org.junit.Test;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    /*
    * create a test that returns a 0.00 price of total
     */

    @Test
    public void return_0_00_when_no_items_are_added() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertEquals(0.00, priceCalculator.getTotal(), 0.01);
    }

}