package design_patterns.creational.singleton;
 class Singleton {
    private Singleton(){

    }
    public static class Holder{
        private static final Singleton instance= new Singleton();
    }

    public static Singleton getInstance(){
        return Holder.instance;
    }

     public static void main(String[] args) {
         Singleton singleton=Singleton.getInstance();
         Singleton singleton1=Singleton.getInstance();
         System.out.println(singleton);
         System.out.println(singleton1);
     }
}
