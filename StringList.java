import java.util.*;

public class StringList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Rahul");
        names.add("Neha");
        names.add("Priya");
        names.add("Riya");

        System.out.println(names);
        System.out.println("Get: " + names.get(1));

        names.set(1, "Rohan");
        System.out.println("Set: " + names);

        names.remove("Neha");
        System.out.println("Remove: " + names);

        System.out.println("Size: " + names.size());
    }
}
