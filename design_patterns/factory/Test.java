package design_patterns.factory;

public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shap1=shapeFactory.getShape("circle");
        shap1.draw();
    }
}
