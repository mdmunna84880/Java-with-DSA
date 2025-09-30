package OOPS;

public class OverrideKeyword {
    public static void main(String[] args) {
        Vehicles car = new Car();

        car.start();
        car.accelerate();
        car.brake();
    }
}

abstract class Vehicles{
    abstract void accelerate();
    abstract void brake();

    void start(){
        System.out.println("The vehicle is started");
    }
}

class Car extends Vehicles{
    @Override
    void accelerate() {
        System.out.println("The car is accelerated");
    }

    @Override
    void brake(){
        System.out.println("The car was braked");
    }
}