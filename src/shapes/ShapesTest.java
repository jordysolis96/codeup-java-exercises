package shapes;

//public class ShapesTest {
//
//    public static void main(String[] args) {
//
//        Measurable myShape = new Rectangle(5, 4);
//
//        System.out.println("myShape.getArea() = " + myShape.getArea());
//        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
//
//        myShape = new Square(5);
//
//        System.out.println("myShape.getArea() = " + myShape.getArea());
//        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
//
////        Quadrilateral box1 = new Rectangle(5, 4);
////        Quadrilateral box2 = new Square(5);
////
////        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
////        System.out.println("box1.getArea() = " + box1.getArea());
////
////        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
////        System.out.println("box2.getArea() = " + box2.getArea());
//
//
//    }
//
//}
//-----------------------------------------redo for practice-----------------------------------
public class ShapesTest{
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        Rectangle box2 = new Square(5);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimeter());
        System.out.println(box2.getArea());
        System.out.println(box2.getPerimeter());

        Measurable myShape;

        myShape = box1;
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        myShape = box2;
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


    }
}