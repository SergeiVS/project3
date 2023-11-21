package homeworkLesson7.exercise2;

public class OperationsCount {

    public static void main(String[] args) {

        AtmMethod atmMethod = new AtmMethod();

        System.out.println("To get all your money you need: " + atmMethod.getNumberOfTries() + " days.");

    }
}

