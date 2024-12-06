package lv.rvt;

public class HealthStation {

private int count;

public int weigh(Person person) {
    this.count = this.count + 1;    
    return person.weight;
    }

public int weighings() {
    return count;
}

public void feed(Person person) {
    person.weight = person.weight + 1;
}
}
