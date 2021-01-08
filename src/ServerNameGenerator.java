import java.util.Random;

//public class ServerNameGenerator {
//
//    private static final String[] nouns = {"aeroplane", "bear", "crate", "duck", "egg",
//            "fowl", "ghost", "hinge", "jackhammer"};
//    private static final String[] adjectives = {"large", "distant", "glorious", "faithful", "undeserving",
//            "hollow", "radical", "uptight", "groovy", "altruistic"};
//
//
//    public static void main(String[] args) {
//        System.out.println(generateServerName());
//    }
//
//    public static String generateServerName() {
//        int randomNounIndex = new Random().nextInt(10);
//        int randomAdjectiveIndex = new Random().nextInt(10);
//
//        return adjectives[randomAdjectiveIndex] + "-" + nouns[randomNounIndex];
//    }
//}

//----------------------------------------Redo for practice-------------------------------------------------------
    public class ServerNameGenerator {
    private static final String[] adjectives = {"Charming", "Cruel", "Fantastic", "Gentle", "Huge", "Perfect", "Rough", "Sharp", "Tasty", "Zealous"};

    private static final String[] nouns = {"man", "woman", "teacher", "home", "love", "office", "money", "car", "table", "dog"};

    public static void main(String[] args) {
        System.out.println(generateRandomName());
    }

    public static String generateRandomName(){
        int randomNounIndex = new Random().nextInt(10);
        int randomAdjectiveIndex = new Random().nextInt(10);

        return adjectives[randomAdjectiveIndex] + "-" + nouns[randomNounIndex];
    }

    }