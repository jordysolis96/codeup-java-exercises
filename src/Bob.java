import java.util.Scanner;

public class Bob {
    public static void main(String[]args){
        Scanner userInput = new Scanner(System.in);
//        String question = "Sure";
//        String Yell = "Whoa, chill out!";
//        String coldShoulder = "Fine. Be that way!";
//        String anyElse = "Whatever.";
//        System.out.println("Would you like to talk to bob? [y/n]");
//        String wantsConversation = userInput.next();
//        String empty = userInput.nextLine();
//        if(wantsConversation.contains("y")) {
//            userInput.nextLine();
//            if (userInput.equals("?")) {
//                System.out.println(question);
//            } else if (userInput.equals("!")) {
//                System.out.println(Yell);
//            } else if (anyElse.isEmpty()) {
//                System.out.println(coldShoulder);
//            } else {
//                System.out.println(anyElse);
//            }
//        }

//--------------------Second redo--------------------------
//        Scanner scanner = new Scanner(System.in);
//        String userResponse;

//        do {
//
//            System.out.print("What do you want to say to Bob? ");
//
//            String input = scanner.nextLine();
//            String response;
//
//            if (input.endsWith("?")) {
//                response = "Sure.";
//            } else if (input.endsWith("!")) {
//                response = "Whoa, chill out!";
//            } else if (input.isEmpty()) {
//                response = "Fine. Be that way!";
//            } else {
//                response = "Whatever.";
//            }
//
//            System.out.printf("Bob says: \"%s\"\n\n", response);
//
//            System.out.print("Did you have anything else to say to Bob? [y/n] ");
//
//            userResponse = scanner.nextLine();
//
//        } while (userResponse.equalsIgnoreCase("y") || userResponse.equalsIgnoreCase("yes"));

//--------------------------------Third redo-------------------------------------------------------------
        String question = "Sure";
        String Yell = "Whoa, chill out!";
        String coldShoulder = "Fine. Be that way!";
        String anyElse = "Whatever.";
        System.out.println("Would you like to talk to bob? [y/n]");
        String wantsConversation = userInput.next();
        String empty = userInput.nextLine();
        if(wantsConversation.contains("y")) {
            System.out.println("Say something to bob!");
            String Input = userInput.nextLine();
            if (Input.endsWith("?")) {
                System.out.println(question);
            } else if (Input.endsWith("!")) {
                System.out.println(Yell);
            } else if (Input.isEmpty()) {
                System.out.println(coldShoulder);
            } else {
                System.out.println(anyElse);
            }
        }
    }
}
