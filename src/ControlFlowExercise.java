import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[]arg) {
//Part 1
        //        int i = 5;
//
//        for ( i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);


//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i <= 1000000L);


//        for(int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }


//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }


//        for(long i = 2; i <= 1000000L; i *= i) {
//            System.out.println(i);
//        }

        //Fizz Buzz exercise
//        for(int i = 1; i <= 100; i++){
//
//            if (i % 3 == 0) {
//                System.out.print("Fizz");
//                if (i % 5 == 0) {
//                    System.out.print("Buzz");
//                }
//                System.out.print("\n");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        //Display a table of powers
//        boolean wantsToContinue = true;
        Scanner userInput = new Scanner(System.in);
//        while (wantsToContinue) {
//            System.out.print("What number would you like to go up to? ");
//            int userNumber = userInput.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userNumber; i++) {
//                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
//            }
//            System.out.println();
//            System.out.print("Would you like to continue? [y/n] ");
//            String userAnswer = userInput.next();
//            if (userAnswer.contains("n")) {
//                wantsToContinue = false;
//            }
//        }

        //Convert the given number grades into letter grades
//        System.out.print("Enter a grade from 1 - 100 ");
//        int userGrade = userInput.nextInt();
//        System.out.println("Your grade was " + userGrade);
//        System.out.println("Would you like to continue? [y/n] ");
//        String wantsLetterGrade = userInput.next();
//        if (wantsLetterGrade.contains("y")) {
//            if(userGrade >= 95){
//                System.out.println("You got an A+!");
//            }
//              else if (userGrade >= 88) {
//                System.out.println("You got an A!");
//            } else if (userGrade >= 80) {
//                System.out.println("You got an B");
//            } else if (userGrade >= 67) {
//                System.out.println("You got an C");
//            } else if (userGrade >= 60) {
//                System.out.println("You got an D");
//            } else {
//                System.out.println("Unfortunately, you failed");
//            }
//        }


        //This is a redo of the ControlFlowExercise
//        int i = 5;
//        for( i = 5; i <= 15; i++){
//            System.out.println(i);
//        }
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        }while (i <= 100);
//
//
//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        }while(i >= -10);
//
//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        }while(i <= 1000000L);
//
//
//        for(int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//
//
//        for(int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }
//
//
//        for(long i = 2; i <= 1000000L; i *= i) {
//            System.out.println(i);
//        }
//
////        Fizz Buzz exercise
//        for(int i = 1; i <= 100; i++){
//
//            if (i % 3 == 0) {
//                System.out.print("Fizz");
//                if (i % 5 == 0) {
//                    System.out.print("Buzz");
//                }
//                System.out.print("\n");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//        Display a table of powers
//        boolean wantsToContinue = true;
//        while (wantsToContinue) {
//            System.out.print("What number would you like to go up to? ");
//            int userNumber = userInput.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userNumber; i++) {
//                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
//            }
//            System.out.println();
//            System.out.print("Would you like to continue? [y/n] ");
//            String userAnswer = userInput.next();
//            if (userAnswer.contains("n")) {
//                wantsToContinue = false;
//            }
//        }

//            Convert the given number grades into letter grades
//        System.out.print("Enter a grade from 1 - 100 ");
//        int userGrade = userInput.nextInt();
//        System.out.println("Your grade was " + userGrade);
//        System.out.println("Would you like to continue? [y/n] ");
//        String wantsLetterGrade = userInput.next();
//        if (wantsLetterGrade.contains("y")) {
//            if(userGrade >= 95){
//                System.out.println("You got an A+!");
//            }
//              else if (userGrade >= 88) {
//                System.out.println("You got an A!");
//            } else if (userGrade >= 80) {
//                System.out.println("You got an B");
//            } else if (userGrade >= 67) {
//                System.out.println("You got an C");
//            } else if (userGrade >= 60) {
//                System.out.println("You got an D");
//            } else {
//                System.out.println("Unfortunately, you failed");
//            }
//        }
//-----------------------------------------------------------------------------------------------
// Third redo
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }

//        for(int i = 2; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i  -= 5){
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 1000000L; i *= i){
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }

//        boolean wantsToContinue = true;
//        while (wantsToContinue) {
//            System.out.println("What number would you like to go up to?");
//            int userNumber = userInput.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userNumber; i++) {
//                System.out.println(i + "      | " + (i * i) + "       | " + (i * i * i));
//            }
//            System.out.println();
//            System.out.print("Would you like to continue? [y/n] ");
//            String userAnswer = userInput.next();
//            if (userAnswer.contains("n")) {
//                wantsToContinue = false;
//            }
//        }

        System.out.println("Please enter a grade from 0-100");
        int grade = userInput.nextInt();
        System.out.printf("Your grade is ", grade);
        System.out.println("Would you like to continue? [y/n] ");
        String wantsLetterGrade = userInput.next();
        if (wantsLetterGrade.contains("y")) {
            if (grade >= 88) {
                System.out.println("You got an A!");
            } else if (grade >= 80) {
                System.out.println("You got a B!");
            } else if (grade >= 67) {
                System.out.println("You got a C!");
            } else if (grade >= 60) {
                System.out.println("You got a D!");
            } else {
                System.out.println("You failed!");
            }
        }

        }
    }
