package designPattern.structural.decorator.textRenderer.concreteDecorator;

import designPattern.structural.decorator.textRenderer.abstractClasses.TextView;
import designPattern.structural.decorator.textRenderer.decoratorClass.TextDecorator;

public class BoldText extends TextDecorator {
    public BoldText(TextView inner){
        super(inner);
        openTag = "<b>";
        closeTag = "</b>";
    }

    @Override
    public String render(){
        return openTag + inner.render() + closeTag;
    }
}
