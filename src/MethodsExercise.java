import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class MethodsExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        addition(2, 3);
//        subtraction(8, 4);
//        multiply(2, 10);
//        division(10, 2);
//        modulus(7, 9);
        getInteger(1, 100);
        dice();
//        factorial(1, 10);
        //        boolean repeat;
//
//        int x = 12;
//        int y = 3;
//
//        System.out.printf("x = %d, y = %d\n", x, y);
//        System.out.printf("x + y = %s\n", add(x, y));
//        System.out.printf("x - y = %s\n", subtract(x, y));
//        System.out.printf("x * y = %s\n", multiply(x, y));
//        System.out.printf("x / y = %s\n", divide(x, y));
//        System.out.printf("x %% y = %s\n", modulus(x, y));
//
//
//        do {
//
//            int numInput = getInteger(1, 10);
//            long answer = factorial(numInput);
//
//            System.out.printf("%d! = %d\n", numInput, answer);
//            System.out.print("Would you like to continue? [y/n] ");
//            String response = input.nextLine();
//            repeat = response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
//
//        } while (repeat);

//        do {
//
//
//            System.out.print("How many sides on each die? ");
//            int sides = input.nextInt();
//            System.out.println("Type ROLL when you're ready to test your luck!");
//            do {
//
//                String response = input.nextLine();
//                if (response.equalsIgnoreCase("roll")) {
//                    break;
//                }
//
//            } while (true);
//
//            rollPairOfDice(6);
//
//            System.out.print("Would you like to roll again? [y/n] ");
//            String response = input.nextLine();
//            if (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("yes")) {
//                break;
//            }
//
//        } while (true);
//
//
//    }
//
//    public static void rollPairOfDice(int sides) {
//
//        int rollOne = rollDie(sides);
//        int rollTwo = rollDie(sides);
//
//        System.out.printf("You rolled a pair of %d-sided dice and got: %d %d\n", sides, rollOne, rollTwo);
//
//    }
//
//    public static int rollDie(int sides) {
//        Random rand = new Random(); //instance of random class;
//
//        return rand.nextInt(sides) + 1;
//    }
//
//    public static long factorial(int n) {
//        if (n == 0) {
//            return 1L;
//        }
//
//        long total = 1;
//
//        for (int i = n; i > 1; i--) {
//            total *= i;
//        }
//
//        return total;
//    }
//
//    public static int getInteger(int min, int max) {
//        Scanner input = new Scanner(System.in);
//        int num;
//
//        do {
//            System.out.printf("Enter a number between %d and %d:\n", min, max);
//            num = input.nextInt();
//
//            if (num < min || num > max) {
//                System.out.printf("%d is an invalid input.\n", num);
//            } else {
//                break;
//            }
//        } while (true);
//
//        return num;
//    }
//
//
//    public static int add(int x, int y) {
//        return x + y;
//    }
//
//    public static int subtract(int x, int y) {
//        return x - y;
//    }
//
//    public static int multiply(int x, int y) {
//        return x * y;
//    }
//
//    public static int divide(int x, int y) {
//        return x / y;
//    }
//
//    public static int modulus(int x, int y) {
//        return x % y;
//-------------------------REDO-----------------------------------------

    }

    //    public static void addition(int Num1, int Num2) {
//        System.out.println(Num1 + Num2);
//    }
//    public static void subtraction(int Sub1, int Sub2){
//        System.out.println(Sub1 - Sub2);
//    }
//    public static void multiply(int mult1, int mult2){
//        System.out.println(mult1 * mult2);
//    }
//    public static void division(int div1, int div2){
//        System.out.println(div1 / div2);
//    }
//    public static void modulus(int mod1, int mod2){
//        System.out.println(mod1 % mod2);
//        }
//
    public static int getInteger(int min, int max) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userInput = num.nextInt();
        if (userInput <= 100) {
            System.out.println("Thank you");
        } else {
            System.out.println("PLease try again");
        }
        return userInput;
    }


//        public static void fact(int min2, int max2){
//            Scanner newNum = new Scanner(System.in);
//            System.out.println("enter a number between 1 and 10!");
//            int userFact = newNum.nextInt();
//            if(userFact <= 10){
//            for(int i = 1; i <= userFact; i++ ){
//                System.out.println(factorial(userFact));
//            }
//        }
//    }

    public static void dice() {
        Scanner userInput = new Scanner(System.in);
        boolean rollAgain = false;
        System.out.println("Would you like to roll some dice? [Y]es");
        String choice = userInput.next();
        if (choice.equalsIgnoreCase("Y")) {
            rollAgain = true;
        } else {
            rollAgain = false;
        }
        while (rollAgain) {
            System.out.println("How many sides does your dice have?");
            int sides = userInput.nextInt();
            for (int i = 1; i < 3; i++) {
                int ran = (int) (Math.random() * sides) + 1;
                System.out.printf("Dice %d landed on: %d%n", i, ran);
            }
            System.out.println("Would you like to roll some dice? [Y]es");
            String again = userInput.next();
            if (again.equalsIgnoreCase("Y")) {
                rollAgain = true;
            } else {
                rollAgain = false;
            }
        }

    }
}
