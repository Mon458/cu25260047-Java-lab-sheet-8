class ResultData<T> {
    T marks;

    ResultData(T marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Marks: " + marks);
    }
}

public class ResultDemo {
    public static void main(String[] args) {
        ResultData<Integer> r1 = new ResultData<>(85);
        ResultData<Double> r2 = new ResultData<>(92.5);

        r1.display();
        r2.display();
    }
}
