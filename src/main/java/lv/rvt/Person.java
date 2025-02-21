package lv.rvt;

public class Person {
    private String name;
    private int age;
    private double weight;
    private double height;
    private String address;

    public Person(String name, int age, double weight, double height, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.address = address;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return name + "," + age + "," + weight + "," + height + "," + address;
    }
}