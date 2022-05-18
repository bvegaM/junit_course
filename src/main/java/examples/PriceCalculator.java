package examples;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private final List<Double> prices = new ArrayList<>();
    private Integer discount;

    public Double getTotal(){
        if (discount == null){
            throw new IllegalArgumentException("Discount is not set");
        }
        Double total = this.prices.stream().mapToDouble(Double::doubleValue).sum();
        Double discount = total * this.discount / 100;
        return total - discount;
    }

    public void add(Double price){
        prices.add(price);
    }
    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
}
