package practiceLesson4.robot;

public class Robot {

    String mark;

    String name;


    //Method for declare the mark of the object

    public void setMark() {


        System.out.println("Mark of this robot is " + mark);
    }

    //Method for self greeting of the object

    public void setName() {


        System.out.println("Hello! My name is " + name);

    }

    // Method for currency exchange
    public void currencyConvert(double amountUsd, double exchangeRate ){



        double valueEur;

             valueEur   = amountUsd * exchangeRate;

        System.out.println("For you " + amountUsd + " you receive " + valueEur + " Euros.");


    }

    public void robotPrintOut(){

        this.mark = mark;

        this.name = name;

        System.out.println("It robot produced by " + mark + " and it´s name is "+ name);

    }
}
