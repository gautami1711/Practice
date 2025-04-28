package design_patterns.builder;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer.Builder()
                .setCPU("Intel 19")
                .setRAM("16GB")
                .setStorage("256GB")
                .build();

        System.out.println("Computer built successfully");
        System.out.println("CPU: "+computer);
    }
}
