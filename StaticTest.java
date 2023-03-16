
class Static {
    static int cnt = 0;

    Static() {
        cnt++;
    }

    void display() {
        System.out.println("Count: " + cnt);
    }

    static String name = "University";
}

public class StaticTest {
    public static void main(String args[]) {
        Static s1 = new Static();
        s1.display();
        Static s2 = new Static();
        s2.display();
        System.out.println("Name: " + Static.name);// Class name
    }
}
// static can't use non static variable or method