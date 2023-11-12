package homeworkLesson3.exercise3;

public class Products {

    double prodA;

    double prodB;

    double discount;

// Declaration of the method

    public void sale () {

        double result = (prodA+prodB)-discount;

        System.out.println("Total sale " + result + " RUB");

        System.out.println("Discount " + discount + " RUB");



    }

}
