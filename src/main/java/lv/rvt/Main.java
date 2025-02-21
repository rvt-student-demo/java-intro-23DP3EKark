package lv.rvt;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        
    }

    public static ArrayList<Person> getPersonList() throws Exception {
        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine();
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");

            if (parts.length < 5) continue;
            
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            int weight = Integer.parseInt(parts[2]);
            int height = Integer.parseInt(parts[3]);
            String address = parts[4];

            Person person = new Person(name, age, weight, height, address);
            personList.add(person);
        }

        reader.close();
        return personList;
    }

    public static void addPerson(Person person) throws Exception {
        String data = person.toString();

        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("persons.csv", true))) { 
            buffer.write(data);
            buffer.newLine();
            buffer.flush();
            System.out.println("Person has been written to the file!");
        } 
    }

    public static void printPersonTable(ArrayList<Person> personList) {
        System.out.printf("%-15s %-5s %-7s %-7s %-20s%n", "Name", "Age", "Weight", "Height", "Address");
        System.out.println("----------------------------------------------------------");
    
        for (Person person : personList) {
            System.out.printf("%-15s %-5d %-7d %-7d %-20s%n",
                    person.getName(), person.getAge(), person.getWeight(), person.getHeight(), person.getAddress());
        }
    }
}