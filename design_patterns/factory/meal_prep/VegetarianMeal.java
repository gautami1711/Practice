package design_patterns.factory.meal_prep;

public class VegetarianMeal implements Meal {

    @Override
    public void prepare() {
        System.out.println("Preparing vegetarian meal");
    }
}
