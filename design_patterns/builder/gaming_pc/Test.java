package design_patterns.builder.gaming_pc;

public class Test {
    public static void main(String[] args) {
        GamingPC pc=new GamingPC.Builder()
                .setCpu("Intel i9")
                .setGpu("NIVIDIA RTX 4090")
                .build();

        System.out.println("Gamin pc built successfully");
    }
}
