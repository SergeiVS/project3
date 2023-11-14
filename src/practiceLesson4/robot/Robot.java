package practiceLesson4.robot;

public class Robot {



    public void setMark(String mark) {


        System.out.println("Mark of this robot is " + mark);
    }

    public void setName(String name) {


        System.out.println("Hello! My name is " + name);

    }

    public double currencyConvert(double amountUsd, double exchangeRate ){



        double valueEur = amountUsd * exchangeRate;



        return valueEur;

    }
}
