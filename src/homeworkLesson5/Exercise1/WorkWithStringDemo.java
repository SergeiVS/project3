package homeworkLesson5.Exercise1;

public class WorkWithStringDemo {

    public static void main(String[] args) {

        // Getting a new object

        WorkWithString myText = new WorkWithString("I study basic Java!");

        // Object print out

        System.out.println(myText.getText());

        System.out.println(" ");

        //Getting the last character of the string

        System.out.println("The last character of the text is: " + myText.getText().charAt(myText.getText().length()-1));

        //Cutting out "Java"



        System.out.println(" ");

        //Proofing for presence of "Java" in the text

        System.out.println("The text contains Java: " + myText.getText().contains("Java") );

        System.out.println(" ");

        // Replacing "a" to "o"

        System.out.println(myText.getText().replaceAll("a", "o"));

        System.out.println(" ");

        // Move text to upper case

        System.out.println(myText.getText().toUpperCase());

        System.out.println(" ");

        // Move text to lower case

        System.out.println(myText.getText().toLowerCase());

        System.out.println(" ");

        // Substring operation, "Java" the last symbol "!" not included

        String substringMyText = myText.getText().substring(14, 18);

        System.out.println(substringMyText);







    }
}
