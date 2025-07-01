package design_patterns.creational.builder;

import java.util.List;

public class Meal {

  public static void main(String[] args) {
    BurgerMeal meal= new  BurgerMeal.BurgerBuilder("wheat","veg").setExtraChess(true).build();

    System.out.println(meal);
  }

}

class BurgerMeal {

  //mandatory fields
  private final String bunType;
  private final String patty;

  //Optional fields
  private final boolean extraCheese;
  private final List<String> toppings;
  private final String drink;

  //private constructor
  private BurgerMeal(BurgerBuilder builder) {
    this.bunType = builder.bunType;
    this.patty = builder.patty;
    this.extraCheese = builder.extraCheese;
    this.toppings = builder.toppings;
    this.drink = builder.drink;
  }

  public static class BurgerBuilder {

    //mandatory fields
    private final String bunType;
    private final String patty;

    //Optional fields
    private boolean extraCheese;
    private List<String> toppings;
    private String drink;

    public BurgerBuilder(String bunType, String patty) {
      this.bunType = bunType;
      this.patty = patty;
    }

    public BurgerBuilder setExtraChess(boolean extraCheese) {
      this.extraCheese = extraCheese;
      return this;
    }

    public BurgerBuilder setToppings(List<String> toppings) {
      this.toppings = toppings;
      return this;
    }

    public BurgerBuilder setDrink(String drink) {
      this.drink = drink;
      return this;
    }

    public BurgerMeal build() {
      return new BurgerMeal(this);
    }

    @Override
    public String toString() {
      return "BurgerBuilder{" +
          "bunType='" + bunType + '\'' +
          ", patty='" + patty + '\'' +
          ", extraCheese=" + extraCheese +
          ", toppings=" + toppings +
          ", drink='" + drink + '\'' +
          '}';
    }
  }

  @Override
  public String toString() {
    return "BurgerMeal{" +
        "bunType='" + bunType + '\'' +
        ", patty='" + patty + '\'' +
        ", extraCheese=" + extraCheese +
        ", toppings=" + toppings +
        ", drink='" + drink + '\'' +
        '}';
  }
}


