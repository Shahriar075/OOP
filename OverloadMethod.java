
class MethodOver {
    void test() {
        System.out.println("No parameters");
    }

    void test(int x) {
        System.out.println("x " + x);
    }

    void test(int x, int y) {
        System.out.println("x,y " + x + " " + y);
    }

    double test(double x, double y) {
        return x * y;
    }

    public static void main(String args[]) {
        MethodOver ob = new MethodOver();
        ob.test();
        ob.test(1);
        ob.test(1, 2);
        System.out.println(ob.test(1.5, 3.7));
    }
}
