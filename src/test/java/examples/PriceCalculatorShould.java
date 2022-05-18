package examples;

import org.junit.Test;
import static org.junit.Assert.*;

public class PriceCalculatorShould {

    /*
    * create a test that returns a 0.00 price of total
    * create a test that returns total price of list total
    * create a test that returns total price of list total with a discount
    * create a exception when discount parameter not exist
     */

    @Test
    public void return_0_00_when_no_items_are_added() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.setDiscount(0);
        assertEquals(0.00, priceCalculator.getTotal(), 0.01);
    }

    @Test
    public void return_total_price_of_list_total() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.add(10.00);
        priceCalculator.add(20.00);
        priceCalculator.setDiscount(0);
        assertEquals(30.00, priceCalculator.getTotal(), 0.01);
    }

    @Test
    public void return_total_price_of_list_total_with_discount(){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.add(10.00);
        priceCalculator.add(20.00);
        priceCalculator.add(30.00);
        priceCalculator.setDiscount(12);
        assertEquals(52.80, priceCalculator.getTotal(), 0.10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void return_exception_when_discount_dont_exist(){
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.add(10.00);
        priceCalculator.add(20.00);
        assertEquals(30.00, priceCalculator.getTotal(), 0.01);
    }

}