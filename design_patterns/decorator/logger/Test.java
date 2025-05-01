package design_patterns.decorator.logger;

public class Test {
    public static void main(String[] args) {
        Logger logger= new TimeStampLoggerDecorator(new ConsoleLogger());

        logger.log("null pointer exception");
    }
}
