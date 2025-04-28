package design_patterns.singleton;

public class Test {
    public static void main(String[] args) {
        Singleton inst1=Singleton.getInstance();
        Singleton inst2=Singleton.getInstance();
        System.out.println(inst1==inst2);

        //testing logger
        Logger.getInstance().log("Application started");
    }
}
