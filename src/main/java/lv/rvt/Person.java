package lv.rvt;

public class Person {
    public String name;
    public String street;


    public Person(String name, String street) {
        this.name = name;
        this.street = street;
    }

    @Override
    public String toString(){
        return this.name + '\n' + ' ' + this.street;
    }


}