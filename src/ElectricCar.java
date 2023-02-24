public class ElectricCar extends Car {
    @Override
    public String getType() {
        return "electric";
    }
    public ElectricCar(Person driver) {
        super(driver);
    }

}
