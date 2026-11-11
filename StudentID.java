class StudentData<T> {
    T id;

    StudentData(T id) {
        this.id = id;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }
}

public class StudentID {
    public static void main(String[] args) {
        StudentData<Integer> s = new StudentData<>(101);
        s.display();
    }
}
