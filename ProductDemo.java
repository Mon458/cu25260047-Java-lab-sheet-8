class ProductData<T, U> {
    T id;
    U price;

    ProductData(T id, U price) {
        this.id = id;
        this.price = price;
    }

    void display() {
        System.out.println("ID: " + id + ", Price: " + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        ProductData<Integer, Double> p1 =
            new ProductData<>(1, 250.5);

        ProductData<Integer, Double> p2 =
            new ProductData<>(2, 500.0);

        ProductData<Integer, Double> p3 =
            new ProductData<>(3, 750.5);

        p1.display();
        p2.display();
        p3.display();
    }
}
