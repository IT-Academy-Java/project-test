package discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

  private List<Double> listPrices = new ArrayList<>();
  private double discount = 0;

  public double getTotal() {
    double result =0;
    for (Double price : listPrices){
      result+= price;
    }

    if(discount > 0){
      return result * ((100 - discount) /100);
    }
    return result;
  }

  public void addPrice(double price){
    listPrices.add(price);
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }
}
