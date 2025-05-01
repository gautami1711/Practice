package design_patterns.decorator.logger;

public class TimeStampLoggerDecorator implements Logger{
    private Logger logger;

    public TimeStampLoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String msg) {
        logger.log("Timestamp: "+System.currentTimeMillis()+":  "+msg);
    }
}
