import java.util.Scanner;
import static java.lang.Float.parseFloat;

public class ConsoleExercises {

    public static void main(String[]args) {


        double pi = 3.14159;

        System.out.format("The value of pi is approximately %s%n", pi);

        Scanner userInput = new Scanner(System.in);


//        System.out.println("Please enter a integer!");
//        int integer = userInput.nextInt();
//        System.out.println(integer);
        //if a user doesn't input a integer then it won't accept the value because it's not a integer as claimed in the .nextInt()

//        System.out.println("Please enter your first, middle, and last name!");
//        String firstName = userInput.next();
//        String middleName = userInput.next();
//        String lastName = userInput.next();
//
//        System.out.println(firstName);
//        System.out.println(middleName);
//        System.out.println(lastName);
        // if less than three words were entered then nothing will happen if you try to enter it'll just shift you down
        //if more than three words are entered then any word after that won't get displayed

//        System.out.print("Please write a sentence");
//        String userSentence = userInput.nextLine();//.nextLine(); will allow me to display the whole line that the user displayed
//
//        System.out.print(userSentence);
//        //.next only return the one token or string word at a time


//        System.out.print("\nThis program wil take in length, width and height, to calculate perimeter, area and volume\n");
//        System.out.print("Length:\n");
//        String lengthInput = userInput.nextLine();
//        System.out.print("Width:\n");
//        String widthInput = userInput.nextLine();
//        System.out.print("Height:\n");
//        String heightInput = userInput.nextLine();
//        float length = parseFloat(lengthInput);
//        float width = parseFloat(widthInput);
//        float height = parseFloat(heightInput);
//        float area = length * width;
//        float perimeter = (2 * length) + (2 * width);
//        float volume = length * width * height;
//        System.out.format("Perimeter: %.2f. Area: %.2f. Volume: %.2f", perimeter, area, volume);
//
//        userInput.useDelimiter("\n");

        // This is a redo of the exercise for extra practice
        System.out.println("Enter a integer!");
        int integer = userInput.nextInt();
        System.out.printf("The integer you entered is %s%n", integer);

        System.out.println("please enter meal, drink, and a side");
        String meal = userInput.next();
        String drink = userInput.next();
        String side = userInput.next();
        System.out.printf("Meal: %s%n", meal);
        System.out.printf("Drink: %s%n", drink);
        System.out.printf("Side: %s%n", side);

        System.out.println("Please enter a sentence!");
        String userSentence = userInput.nextLine();
        System.out.printf("Sentence: %s%n", userSentence);

        System.out.println("Enter the length and width of the classroom!");
        System.out.println("Length: ");
        String userlength = userInput.nextLine();
        System.out.println("Width: ");
        String userwidth = userInput.nextLine();
        System.out.print("Height:\n");
        String heightInput = userInput.nextLine();
        float length = parseFloat(userlength);
        float width = parseFloat(userwidth);
        float height = parseFloat(heightInput);
        float area = length * width;
        float perimeter = (2 * length) + (2 * width);
        float volume = length * width * height;
        System.out.format("Perimeter: %.2f. Area: %.2f. Volume: %.2f", perimeter, area, volume);

        userInput.useDelimiter("\n");
    }

}
