package shapes;


//public class Square extends Quadrilateral {
//
//    public Square(double side) {
//        super(side, side);
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
//        return 4 * this.getLength();
//    }
//
//    @Override
//    public double getArea() {
//        return this.getLength() * this.getLength();
//    }

//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getArea() {
//        return this.getLength() * this.getLength();
//    }
//
//    public double getPerimeter() {
//        return 4 * this.getLength();
//    }
//}
//------------------------------redo Inheritance and polymorphism for practice------------------------------------
public class Square extends Rectangle {
    public Square(double side){
        super(side,side);
    }

    public double getArea(){
        return length * length;
    }

    public double getPerimeter(){
        return 4 * length;
    }
}
//--------------------------redo Interfaces and Abstract Classes for x-practice--------------------------------------
//public class Square extends Quadrilateral{
//    public Square(double length, double width) {
//        super(length, width);
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 0;
//    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }
//
//    @Override
//    public void setLength(double length) {
//
//    }
//
//    @Override
//    public void setWidth(double width) {
//
//    }
//}