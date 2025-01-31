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

    @Override
    public String toString() {
        return this.name + '\n' + ' ' + this.street + '\n' + ' ' + "Student credits " + this.credits; 
    }
}
