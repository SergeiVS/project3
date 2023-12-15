package abstractCar;

public class AutoRide {
    public static void main(String[] args) {
        Car car = new Car("Sedan", 10);
        SportCar sportCar = new SportCar("ferrary", 3);
        Lorry lorry = new Lorry("actros", 150);
        Automobile[] automobiles = {car, sportCar, lorry};

        for (int i = 0; i < automobiles.length; i++) {
            automobiles[i].acceletarionMessaga();
            automobiles[i].startBoost();
        }
    }
}
