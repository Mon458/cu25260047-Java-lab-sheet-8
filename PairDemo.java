class PairData<T, U> {
    T id;
    U name;

    PairData(T id, U name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class PairDemo {
    public static void main(String[] args) {
        PairData<Integer, String> p =
            new PairData<>(101, "Rahul");

        p.display();
    }
}
