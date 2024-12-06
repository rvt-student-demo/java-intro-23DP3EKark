package lv.rvt;

public class HealthStation {

public int weigh(Person person) {
        return person.weight;
    }

public void feed(Person person) {
    person.weight = person.weight + 1;
}
}
