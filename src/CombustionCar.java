public class CombustionCar extends Car {
    @Override
    public String getType() {
        return "combustion";
    }
    public CombustionCar(Person driver) {
        super(driver);
    }

}
