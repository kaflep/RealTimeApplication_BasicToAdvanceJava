package assignmentTwo.abstraction;

public abstract class Car {
    protected String carTypes;

    public Car(String carTypes) {
        this.carTypes = carTypes;
    }


    public abstract  void startEngine();
}

class ElectricCar extends Car {
    private  String model;
    public ElectricCar( String carTypesInElectric, String model){
        super(carTypesInElectric);
         this.model = model;
    }
    @Override
    public void startEngine() {
        System.out.println( carTypes +  ", is " + model+" years  model, which is Electric car that works on battery");

    }
}
class PetrolCar extends Car {
    private  String model;
    public PetrolCar( String carTypesInPetrol, String model){
        super(carTypesInPetrol);
        this.model = model;
    }
    @Override
    public void startEngine() {
        System.out.println( carTypes +  ", is " + model+" years  model, which is petrol car that works on petrol");

    }
}
class CarEngineSystem {
    public static void main(String[] args) {
        Car car, car1;
        car = new ElectricCar("Toyota", "2022");
        car.startEngine();
        car1 = new PetrolCar("nisan","2013");
        car1.startEngine();


    }
}
