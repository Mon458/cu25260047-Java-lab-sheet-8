import java.util.*;

public class SearchList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i * 5);
        }

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (list.contains(n)) {
            System.out.println("Number Found");
        } else {
            System.out.println("Number Not Found");
        }

        sc.close();
    }
}
