package designPattern.structural.decorator.textRenderer.client;

import designPattern.structural.decorator.textRenderer.abstractClasses.TextView;
import designPattern.structural.decorator.textRenderer.concreteClasses.PlainText;
import designPattern.structural.decorator.textRenderer.concreteDecorator.BoldText;
import designPattern.structural.decorator.textRenderer.concreteDecorator.UnderlineText;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String message = scanner.nextLine();

        //suppose we have to make the text bold and underlined;
        TextView textView = new PlainText(message);
        textView = new UnderlineText(textView);
        textView = new BoldText(textView);

        System.out.println("The html format is: " + textView.render());
    }
}
