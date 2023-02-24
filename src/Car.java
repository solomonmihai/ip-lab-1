import java.util.ArrayList;
public abstract class Car {
    public abstract String getType();

    public ArrayList<Person> getPassengers() {
        return passengers;
    }

    public void addPassenger(Person name) {
        passengers.add(name);
    }

    public void addPassenger(ArrayList<Person> passengers) {
        this.passengers.addAll(passengers);
    }

    public Person getDriver() {
        return driver;
    }

    private Person driver;

   ArrayList<Person> passengers;

   public Car(Person driver) {
       this.passengers = new ArrayList<Person>();
       this.driver = driver;
   }

    @Override
    public String toString() {
       String res =  getType() + " fueled car driven by " + driver + ", passengers:\n";
       for (Person p : passengers) {
           res += p + " \n";
       }
       return res;
    }
}
