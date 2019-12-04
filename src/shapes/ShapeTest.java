package shapes;

public class ShapeTest {
    
    public static void main(String[] args) {
        Rectangle myShape = new Rectangle(3,5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getLength());

    }
}
