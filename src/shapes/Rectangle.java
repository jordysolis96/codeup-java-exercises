package shapes;

//public class Rectangle extends Quadrilateral implements Measurable{
//
//    public Rectangle(double length, double width) {
//        super(length, width);
//    }
//
//    @Override
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    @Override
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 2 * (this.getLength() + this.getWidth());
//    }
//
//    @Override
//    public double getArea() {
//        return this.getLength() * this.getWidth();
//    }


//    protected double length, width;
//
//    public Rectangle(double length, double width) {
//        this.setLength(length);
//        this.setWidth(width);
//    }
//
//
//    public double getLength() {
//        return this.length;
//    }
//
//    public double getWidth() {
//        return this.width;
//    }
//
//    public void setLength(double value) {
//        this.length = value;
//    }
//
//    public void setWidth(double value) {
//        this.width = value;
//    }
//
//    public double getArea() {
//        return this.getLength() * this.getWidth();
//    }
//
//    public double getPerimeter() {
//        return 2 * (this.getLength() + this.getWidth());
//    }

//}
//-------------------------------------redo of Inheritance and Polymorphism for practice--------------------------------
//public class Rectangle{
//    protected double length;
//    protected double width;
//
//    public Rectangle(double l, double w){
//        this.length = l;
//        this.width = w;
//    }
//
//    public double getPerimeter(){
//        return (2 * length + 2 * width);
//    }
//
//    public double getArea(){
//        return (length * width);
//    }
//
//}
//-----------------------------------------Interfaces and Abstract Classes x-practice-----------------------------------
public class Rectangle extends Quadrilateral implements Measurable{


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}