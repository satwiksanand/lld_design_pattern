package designPattern.creational.prototype;

public class Circle implements PrototypeClonable {
    private final int radius;
    private String color;

    public Circle(int rad, String col){
        this.radius = rad;
        this.color = col;
    }

    public void setColor(String newCol){
        this.color = newCol;
    }

    public PrototypeClonable clone() {
        return new Circle(this.radius, this.color);
    }

    public String toString(){
        return "The radius is: " + this.radius + "\nThe color is: " + this.color;
    }
}
