//public class Person {
//
//    private String name;
//
//    public static void main(String[] args) {
//        Person john = new Person("John");
//
//        john.sayHello();
//
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//    }
//}
//
//
//
//    public Person(String name) {
//        this.setName(name);
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//    public void sayHello(){
//        System.out.printf("Hello, %s\n!", this.getName());
//    }
//
//    public static Person[] addPerson(Person newPerson, Person[] personArray) {
//        Person[] newArray = new Person[personArray.length + 1];
//
//        for (byte i = 0; i < personArray.length; i++) {
//            newArray[i] = personArray[i];
//        }
//        newArray[personArray.length] = newPerson;
//
//        return newArray;
//    }
//
//
//}

//------------------Refacotor------------------------------------
public class Person{
    private String name;

    public static void main(String[] args) {
        Person john = new Person("john");
        john.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());//person 1 and 2 will be jane because Person1 and Person2 are equal to each other
    }



    public Person(String name) {
        this.setName(name);
    }
    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello %s!\n", this.getName());
    }
}

