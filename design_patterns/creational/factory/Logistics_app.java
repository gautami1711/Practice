package design_patterns.creational.factory;

public class Logistics_app {
    public static void main(String[] args) {
        LogisticsService service=new LogisticsService();
        service.send("Air");
    }
}

interface Logistics{
    void send();
}

class Road implements Logistics{

    @Override
    public void send() {
        System.out.println("Sent by Road");
    }
}

class Air implements Logistics{
    @Override
    public void send() {
        System.out.println("Sent by Air");
    }
}

class LogisticsFactory{
    public static Logistics send(String mode){
        if(mode.equalsIgnoreCase("air"))return new Air();
        else if(mode.equalsIgnoreCase("road"))return new Road();

        return (Logistics) new IllegalArgumentException("This mode of transport is not supported");
    }
}

class LogisticsService{

    public void send(String mode){
        Logistics logistics=LogisticsFactory.send(mode);
        logistics.send();
    }
}
