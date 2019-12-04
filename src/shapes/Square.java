package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side,side);
    }

    @Override
    public void setLength(double l) {
        this.length = l;
        this.width = l;
    }

    @Override
    public void setWidth(double w) {
        this.width = w;
        this.length = w;
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
