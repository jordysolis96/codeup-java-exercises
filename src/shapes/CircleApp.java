package shapes;

import util.Input;

//public class CircleApp {


//    public static void main(String[] args) {
//
//        boolean repeat;
//
//        do {
//            Input input = new Input();
//
//            Circle c = new Circle(input.getDouble("Enter the radius:"));
//
//            c.printInfo();
//
//            repeat = input.yesNo("Do you want to enter another radius?");
//
//        } while (repeat);

//        Circle.totalCirclesCreated();

//    }

//}
//------------------------------------------Circle app refactor-----------------------------------
public class CircleApp{
    public static void main(String[] args) {
        Input userInput = new Input();
        System.out.println("Enter the radius of this circle");
        double radius = userInput.getDouble();
        Circle circle = new Circle(radius);
        System.out.printf("The area of the circle is: %f%n", circle.getArea());
        System.out.printf("The circumference of the circle is: %f", circle.getCircumference());

    }
}