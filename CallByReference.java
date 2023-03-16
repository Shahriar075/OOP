
public class CallByReference {
    String name;

    void change(CallByReference n) {
        n.name = "Karim";
    }

    public static void main(String args[]) {
        CallByReference c = new CallByReference();
        c.name = "Rahim";
        System.out.println("Before changing: " + c.name);
        c.change(c);
        System.out.println("After changing: " + c.name);

    }
}
