package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    @Override
    public double getArea(){
        System.out.println("sq getArea");
        return Math.pow(super.length, 2);
    }

    @Override
    public double getPerimeter(){
        System.out.println("sq getPerimeter");
        return 4 * super.width;
    }

}
