package design_patterns.decorator.document_editor;

public class BoldText extends TextDecorator{

    public BoldText(Text text) {
        super(text);
    }

    @Override
    public String format() {
        return "<b"+text.format()+"</i>";
    }
}
