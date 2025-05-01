package design_patterns.decorator.document_editor;

public class ItalicText extends TextDecorator{

    public ItalicText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<i>"+text.format()+"</i>";
    }
}
