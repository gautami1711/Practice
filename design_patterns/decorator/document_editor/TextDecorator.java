package design_patterns.decorator.document_editor;

public abstract class TextDecorator implements Text{
    protected Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }
}
