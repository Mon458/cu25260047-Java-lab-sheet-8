class MyBox<T> {
    T value;

    MyBox(T value) {
        this.value = value;
    }

    void display() {
        System.out.println(value);
    }
}

public class Box {
    public static void main(String[] args) {
        MyBox<Integer> b1 = new MyBox<>(100);
        MyBox<String> b2 = new MyBox<>("Hello");
        MyBox<Double> b3 = new MyBox<>(25.5);

        b1.display();
        b2.display();
        b3.display();
    }
}