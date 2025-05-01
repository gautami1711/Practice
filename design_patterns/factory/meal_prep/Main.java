package design_patterns.factory.meal_prep;

public class Main {
    public static void main(String[] args) {
        MealFactory factory=new MealFactory();
        Meal meal= factory.getMeal("VEG");
        meal.prepare();
    }
}
