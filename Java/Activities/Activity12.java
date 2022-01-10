package activities;

interface Addable {
    int add(int a, int b);
}

public class Activity12 {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        Addable add1 = (a, b) -> (a + b);
        System.out.println(add1.add(90, 60));

        // Lambda expression with return keyword.
        Addable add2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(add2.add(200, 700));
    }
}
