public class Person {

    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;
    @Override
    public String toString()
    {
        return "Name: " + this.name + ", Age: " + this.age;
    }
}
