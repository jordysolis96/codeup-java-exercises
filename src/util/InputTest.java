package util;

//public class InputTest {
//
//    public static void main(String[] args) {
//
//        boolean repeat;
//
//        do {
//            String userStr;
//            Input test = new Input();
//
//            int userInt = test.getInt();
//            System.out.printf("User Input: %d\n", userInt);
//
//            userInt = test.getInt(1, 10);
//            System.out.printf("User Input: %d\n", userInt);
//
//            double userDouble = test.getDouble();
//            System.out.printf("User Input: %f\n", userDouble);
//
//            userDouble = test.getDouble(1.5, 9.5);
//            System.out.printf("User Input: %f\n", userDouble);
//
//            repeat = test.yesNo("Do you want to run the test again?");
//
//        } while (repeat) ;
//    }
//
//}
//-----------------------------practice redo-------------------------------------
public class InputTest{
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println(input.yesNo());
        System.out.println(input.getInt(1,10));
        System.out.println(input.getDouble(10,20));
    }
}
