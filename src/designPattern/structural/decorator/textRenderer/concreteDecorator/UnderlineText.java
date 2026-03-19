package designPattern.structural.decorator.textRenderer.concreteDecorator;

import designPattern.structural.decorator.textRenderer.abstractClasses.TextView;
import designPattern.structural.decorator.textRenderer.decoratorClass.TextDecorator;

public class UnderlineText extends TextDecorator {

    public UnderlineText(TextView inner){
        super(inner);
        openTag = "<u>";
        closeTag = "</u>";
    }

    @Override
    public String render() {
        return openTag + inner.render() + closeTag;
    }
}
