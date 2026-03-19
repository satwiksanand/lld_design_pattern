package designPattern.structural.decorator.textRenderer.concreteDecorator;

import designPattern.structural.decorator.textRenderer.abstractClasses.TextView;
import designPattern.structural.decorator.textRenderer.decoratorClass.TextDecorator;

public class ItalicText extends TextDecorator {
    public ItalicText(TextView inner){
        super(inner);
        openTag = "<i>";
        closeTag = "</i>";
    }

    @Override
    public String render(){
        return openTag + inner.render() + closeTag;
    }
}
