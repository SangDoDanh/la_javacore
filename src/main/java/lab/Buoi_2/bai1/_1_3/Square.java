package lab.Buoi_2.bai1._1_3;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return  super.getWidth();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }
}
