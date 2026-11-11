class EmployeeData<T, U> {
    T id;
    U name;

    EmployeeData(T id, U name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        EmployeeData<Integer, String> e =
            new EmployeeData<>(101, "Amit");

        e.display();
    }
}
