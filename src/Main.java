import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car porsche = new CombustionCar(new Person("Mihai",19));
        porsche.addPassenger(new Person("Ion",20));
        porsche.addPassenger(new Person("Cristiano",38));
        porsche.addPassenger(new Person("Andreea",21));

        Car tesla = new ElectricCar(new Person("Robert",20));
        var p = new ArrayList<Person>();
        p.add(new Person("Ioana",20));
        p.add(new Person("Alex",23));
        p.add(new Person("Calin",24));
        p.add(new Person("Vali",20));
        tesla.addPassenger(p);

        System.out.println(porsche);
        System.out.println(tesla);
    }
}