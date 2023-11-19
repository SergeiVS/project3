package homeworkLesson5.exercise5;

public class Numbers {

   double a;

    double b;

    public Numbers(double a, double b) {

        this.a = a;

        this.b = b;
    }
public double getA(){

        return a;

}

    public double getB() {
        return b;
    }

    public void addition(){

        double addition = a + b;

        System.out.println("a + b = " + addition);

    }
    public void substraction(){

        double substraction = a - b;

        System.out.println("a - b = " + substraction);

    }

    public void multiplication(){

        double multiplication = a * b;

        System.out.println("a * b = " + multiplication);

    }

    public void division(){

        double division = a / b;

        System.out.println("a / b = " + division);

    }


}

