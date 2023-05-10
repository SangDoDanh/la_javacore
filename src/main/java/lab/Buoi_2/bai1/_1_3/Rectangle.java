package lab.Buoi_2.bai1._1_3;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(){}

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPremeter() {
        return 0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
}
