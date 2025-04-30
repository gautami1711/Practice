package design_patterns.factory.abstract_factory;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;

        //base this on us detection logic
        String osType="Mac";
        if(osType.equalsIgnoreCase("windows")){
            guiFactory=new WindowsFactory();
        }else {
            guiFactory=new MacFactory();
        }

        Application application=new Application(guiFactory);
        application.renderUI();
    }
}
