
public class Recursion {
    int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String args[]) {
        Recursion r = new Recursion();
        System.out.println(r.fact(5));
    }
}
