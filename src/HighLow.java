import java.util.Random;
//
//public class HighLow {
//    public static void main(String[] args) {
//
//        Random rand = new Random();
//        int randomNumber, guess;
//
//        System.out.println("Guess the secret number!");
//
//        do {
//            randomNumber =  rand.nextInt(100) + 1;
//
//            guess = MethodsExercise.getInteger(1, 100);
//
//            if (guess > randomNumber) {
//                System.out.println("Too high!");
//            } else if (guess < randomNumber) {
//                System.out.println("Too low!");
//            } else {
//                System.out.println("Good guess! You're right!");
//            }
//
//        } while (guess != randomNumber);
//
//
//    }
//}
//--------------------------------redo----------------------------------------
public class HighLow{
    public static void main(String[] args) {
        Random random = new Random();//gens randon num
        int randomNumber, guess;

        System.out.println("Guess a number from 1-100");

        do {
            randomNumber = random.nextInt(100) + 1;//what the random num will be

            guess = MethodsExercise.getInteger(1, 100);//what user input will be

            if (guess > randomNumber) {//if input is too high
                System.out.println("Too high!");
            } else if (guess < randomNumber) {//if input is too low
                System.out.println("Too low!");
            } else {//if input is on the money
                System.out.println("Good guess! You're right!");

            }
        }while (guess != randomNumber) ;//condition

    }
}
