package practiceLesson4.car;

public class Car {

    String model;

    double engine;

    String color;

    boolean transmission;

    public void car(){

        this.model = model;

        this.engine = engine;

        this.color = color;

        this.transmission = transmission;
    }

    public String beep(){

        car();

        System.out.println("This is "+ model + " it is " + color+", beep");

        return model;



    }

    public double drive(){

        car();

        System.out.println("It´s engin is "+ engine+ ", it´s transmission is " + transmission + " It´s drives and stops");

        return engine;
    }


}
