class DataContainer<T> {
    T value;

    void add(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class ContainerDemo {
    public static void main(String[] args) {
        DataContainer<Integer> c1 = new DataContainer<>();
        DataContainer<String> c2 = new DataContainer<>();
        DataContainer<Double> c3 = new DataContainer<>();

        c1.add(100);
        c2.add("Hello");
        c3.add(25.5);

        System.out.println(c1.get());
        System.out.println(c2.get());
        System.out.println(c3.get());
    }
}
