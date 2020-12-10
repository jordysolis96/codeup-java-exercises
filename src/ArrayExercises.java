import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

//        Person p1 = new Person("John");
//        Person p2 = new Person("Joe");
//        Person p3 = new Person("Jane");
//
//        Person[] personArray = {p1, p2, p3};

        Person[] personArray = new Person[0];
        personArray = Person.addPerson(new Person("John"), personArray);
        personArray = Person.addPerson(new Person("Joe"), personArray);
        personArray = Person.addPerson(new Person("Jane"), personArray);

        for (Person p: personArray) {
            System.out.println(p.getName());
        }

    }
}
