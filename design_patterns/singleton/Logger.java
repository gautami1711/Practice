package design_patterns.singleton;

public class Logger {
    private static Logger logger=new Logger();
    private Logger(){}
    public static Logger getInstance(){
        return logger;
    }
    public  void log(String msg){
        System.out.println("LOG: "+msg);
    }
}
