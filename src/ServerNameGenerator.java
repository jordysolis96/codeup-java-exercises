import java.util.Random;

public class ServerNameGenerator {

    private static final String[] nouns = {"aeroplane", "bear", "crate", "duck", "egg",
            "fowl", "ghost", "hinge", "jackhammer"};
    private static final String[] adjectives = {"large", "distant", "glorious", "faithful", "undeserving",
            "hollow", "radical", "uptight", "groovy", "altruistic"};


    public static void main(String[] args) {
        System.out.println(generateServerName());
    }

    public static String generateServerName() {
        int randomNounIndex = new Random().nextInt(10);
        int randomAdjectiveIndex = new Random().nextInt(10);

        return adjectives[randomAdjectiveIndex] + "-" + nouns[randomNounIndex];
    }
}