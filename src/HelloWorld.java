public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFavoriteNumber = 13;
        System.out.println(myFavoriteNumber);

        String myString = "Hi there!";
        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

        double num = 3.14;
        float myNumber2 = (float) num;
        System.out.println(myNumber2);

//        int x = 5;
//        System.out.println(x++); //this will increment the value but wont show the vale until it's called again
//        System.out.println(x); //will show the new incremented value

//        int x = 5;
//        System.out.println(++x); //this will increment the value and display it
//        System.out.println(x); //will show the new incremented value

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; //A string can tbe casted into a int so it'll give you an error

//        int three = (int) "three"; //A string can be converted into an int so it'll give you an error

//        int x = 4 + 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4 * x;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

        byte test = 127;
//        ERROR = java: incompatible types: possible lossy conversion from int to byte, highest = 127
        short testing = 32767;
        int anotherOne = 2147483647;
        long testers = 999999999;
        System.out.print(test);

        
    }

}

