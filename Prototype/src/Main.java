import javax.swing.plaf.IconUIResource;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle1 = new Circle(1,1,3);
        Circle circle2 = circle1.copy();

        System.out.println(circle1 + " : " + "x : " + circle1.getX() + ", y : " + circle1.getY() + ", r : " + circle1.getR());
        System.out.println(circle2 + " : " + "x : " + circle2.getX() + ", y : " + circle2.getY() + ", r : " + circle2.getR());

    }
}
