package designPattern.structural.decorator.textRenderer.decoratorClass;

import designPattern.structural.decorator.textRenderer.abstractClasses.TextView;

public abstract class TextDecorator implements TextView {
    protected final TextView inner;
    protected String openTag;
    protected String closeTag;

    protected TextDecorator(TextView inner){
        this.inner = inner;
    }
}
