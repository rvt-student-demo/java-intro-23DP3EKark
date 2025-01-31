package lv.rvt;

public class Teacher extends Person {
    public Integer salary;

    public Teacher(String name, String street, Integer salary) {
        super(name, street);

        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.name + '\n' + ' ' + this.street + '\n' + ' ' + "salary " + this.salary + " euro/month"; 
    }
}
