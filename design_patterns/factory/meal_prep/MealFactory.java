package design_patterns.factory.meal_prep;

public class MealFactory {

    public Meal getMeal(String type){
        if("VEG".equalsIgnoreCase(type))return new VegetarianMeal();
        if("NONVEG".equalsIgnoreCase(type))return new NonVegetarianMeal();
        return null;
    }
}
