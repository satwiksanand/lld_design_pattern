package designPattern.creational.prototype;

public class Prototype {
    public static void main(String[] args){
        PrototypeClonable c1 = new Circle(5, "black");
        PrototypeClonable r1 = new Rectangle(5, 4, "white");

        System.out.println(c1.toString());
        System.out.println(r1.toString());

        PrototypeClonable r2 = r1.clone();
        System.out.println(r2.toString());
        r2.setColor("blue");
        System.out.println(r2.toString());
        System.out.println(r1.toString());
    }
}
