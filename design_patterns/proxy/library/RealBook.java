package design_patterns.proxy.library;

public class RealBook implements Book{
    private String title;
    private String author;
    private String  reviews;


    public RealBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.reviews = loadReviews();
    }

    private String loadReviews(){
        System.out.println("Loading reviews");
        return "5 stars";
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: "+title+" ,Author: "+author);
    }

    @Override
    public void displayAdditionalDetails() {
        System.out.println("Reviews "+reviews);
    }
}
