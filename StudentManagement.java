
import java.util.*;

class StudentRecord<T, U, V> {
    T id;
    U name;
    V marks;

    StudentRecord(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        ArrayList<StudentRecord<Integer, String, Double>> list =
            new ArrayList<>();

        list.add(new StudentRecord<>(101, "Amit", 85.5));
        list.add(new StudentRecord<>(102, "Neha", 90.0));
        list.add(new StudentRecord<>(103, "Rahul", 78.5));
        list.add(new StudentRecord<>(104, "Priya", 88.0));
        list.add(new StudentRecord<>(105, "Riya", 92.5));

        System.out.println("All Students:");

        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }

        ArrayList<Integer> ids = new ArrayList<>();

        for (StudentRecord<Integer, String, Double> s : list) {
            ids.add(s.id);
        }

        int searchId = 103;

        System.out.println("Search ID: " + searchId);

        if (ids.contains(searchId)) {
            System.out.println("Student Found");

            for (StudentRecord<Integer, String, Double> s : list) {
                if (s.id.equals(searchId)) {
                    s.display();
                    break;
                }
            }
        } else {
            System.out.println("Student Not Found");
        }

        System.out.println("Total Students: " + list.size());
    }
}