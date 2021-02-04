package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public static void main(String[] args) {

        Student student1 = new Student("John");
        System.out.println("student1.getName() = " + student1.getName());

        System.out.println("Adding 77, 85, and 98");
        student1.addGrades(77, 85, 98);

        System.out.println("student1.toString() = " + student1.getGrades().toString());
        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());
    }

    public Student(String name) {
        setName(name);
    }

    public Student(String name, int ...grades) {
//        NullPointerException
//        try {
//            System.out.println("this.name.length() = " + this.name.length());
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException");
//            System.out.println(e);
//        }


        setName(name);
        addGrades(grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void addGrades(int ...grades) {
        for (int grade: grades) {
            this.addGrade(grade);
        }
    }
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;

//        IndexOutOfBoundsException
//        try {
//            for (int i = 0; i <= this.grades.size(); i++) {
//                sum += grades.get(i);
//            }
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("IndexOutOfBoundsException");
//            System.out.println(e);
//        }

        for (int grade: this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }
}
//------------------------redo for practice--------------------------------------
//public class Student{
//    private String name;
//    private ArrayList<Integer> grade = new ArrayList<>();
//
//    // returns the student's name
//    public String getName(){
//        return name;
//    };
//    // adds the given grade to the grades property
//    public void addGrade(int grade){
//        this.grade.add(grade);
//    };
//    // returns the average of the students grades
//    public double getGradeAverage(ArrayList<Integer>grades){
//        double total = 0;
//        double size = grades.size();
//        for(int grade : grades){
//            total += grade;
//        }
//        return total/size;
//    };
//
//    public String student(){
//        return this.name;
//    }
//
//    public student(String name, ArrayList<Integer>grade, String Name){
//        this.name = name;
//        this.grade = grade;
//        this.stu = Name;
//    }
//
//    public static void main(String[] args) {
//        Student one = new Student("guy");
//
//    }
//}