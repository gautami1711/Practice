package design_patterns.proxy.library;

public class Test {
    public static void main(String[] args) {
        Book book=new ProxyBook("The Alchemist","Paulo Coelho");
        book.displayDetails();
        book.displayAdditionalDetails();
    }
}
