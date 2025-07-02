package design_patterns.creational.decorator;

public class CustomizePizza {
    public static void main(String[] args) {
        Pizza pizza=new PlainPizza();

        pizza=new Mushrooms(pizza);

        pizza=new ExtraCheese(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}

interface Pizza{
    String getDescription();
    int getCost();
}

class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "this is a plain pizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}

abstract class PizzaDecorator implements Pizza{
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class ExtraCheese extends PizzaDecorator{


    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with extra cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+20;
    }
}


class Mushrooms extends PizzaDecorator{


    public Mushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with mushroom topping";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+30;
    }
}



