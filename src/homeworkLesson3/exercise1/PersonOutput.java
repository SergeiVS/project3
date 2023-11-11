package homeworkLesson3.exercise1;

public class PersonOutput {

    public static void main(String[] args) {

Person thePerson = new Person("Sergei Smirnov", 50, "Baden-Baden");

        System.out.println("My name is " + thePerson.name);
        System.out.println("I`m " + thePerson.age +" years old.");
        System.out.println("I live in " + thePerson.location);
    }
}
