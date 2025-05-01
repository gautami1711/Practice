package design_patterns.decorator.document_editor;

public class Main {
    public static void main(String[] args) {
        Text plainText=new PlainText("Hello world");
        Text bold=new BoldText(plainText);
        Text italic=new ItalicText(bold);

        System.out.println(italic.format());
    }
}
