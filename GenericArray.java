import java.util.*;

public class GenericArray {

    static <T> void display(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        ArrayList<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Neha");

        display(numbers);
        display(names);
    }
}
