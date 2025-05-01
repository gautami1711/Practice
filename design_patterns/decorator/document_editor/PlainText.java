package design_patterns.decorator.document_editor;

public class PlainText implements Text{
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String format() {
        return text;
    }
}
