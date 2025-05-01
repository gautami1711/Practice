package OOPs.volatile_keyword;

public class VolatileExample {
    private static volatile boolean flag=false;

    public static void main(String[] args) throws InterruptedException {
        Thread writer= new Thread(()->{
           flag=true;
            System.out.println("Flag set to true");
        });

        Thread reader = new Thread(()->{
            while (!flag){
                System.out.println("Flag still false");
            }
            System.out.println("Detected flag changed");
        });

        writer.start();
        reader.start();
    }
}
