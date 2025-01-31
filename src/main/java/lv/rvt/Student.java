package lv.rvt;

public class Student extends Person {

    public int credits;

    public Student(String name, String street){
        super(name, street);
    }

    public int study() {
        return this.credits += 1;
    }

    public int credits() {
        return this.credits;
    }
}
