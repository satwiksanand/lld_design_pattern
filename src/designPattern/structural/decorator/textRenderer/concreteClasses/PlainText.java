package designPattern.structural.decorator.textRenderer.concreteClasses;

import designPattern.structural.decorator.textRenderer.abstractClasses.TextView;

public class PlainText implements TextView {
    private final String message;

    public PlainText(String message){
        this.message = message;
    }

    public String render(){
        return message;
    }
}
