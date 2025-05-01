package design_patterns.factory.meal_prep;

public class NonVegetarianMeal implements Meal{
    @Override
    public void prepare() {
        System.out.println("Preparing non vegetarian meal");
    }
}
