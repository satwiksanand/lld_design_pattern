package designPattern.creational.prototype;

public class Rectangle implements PrototypeClonable{
    private final int len;
    private final int width;
    private String color;

    public Rectangle(int len, int width, String color) {
        this.len = len;
        this.width = width;
        this.color = color;
    }

    public PrototypeClonable clone(){
        return new Rectangle(this.len, this.width, this.color);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Rectangle [len=" + len + ", width=" + width + ", color=" + color + "]";
    }
}
