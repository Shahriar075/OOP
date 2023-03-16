
public class VarLenArg {
    void add(int... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String args[]) {
        VarLenArg v = new VarLenArg();
        v.add(1, 2, 3);
        v.add(1, 2);
    }
}
