package design_patterns.proxy.library;

public class ProxyBook implements Book {
    private RealBook realBook;
    String title;
    String author;

    public ProxyBook(String title, String author) {
        this.title = title;
        this.author = author;
    }


    @Override
    public void displayDetails() {
        System.out.println("Title: "+title+" ,Author: "+author);
    }

    @Override
    public void displayAdditionalDetails() {
        if(realBook==null){
            realBook=new RealBook(title,author);
        }
        realBook.displayAdditionalDetails();
    }
}
