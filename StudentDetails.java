class StudentInfo<T, U, V> {
    T id;
    U name;
    V marks;

    StudentInfo(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        StudentInfo<Integer, String, Double> s1 =
            new StudentInfo<>(101, "Amit", 85.5);

        StudentInfo<Integer, String, Double> s2 =
            new StudentInfo<>(102, "Neha", 90.0);

        StudentInfo<Integer, String, Double> s3 =
            new StudentInfo<>(103, "Rahul", 78.5);

        s1.display();
        s2.display();
        s3.display();
    }
}
