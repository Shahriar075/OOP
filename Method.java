
public class Method {
    String name;
    int id;

    void set(String n, int i)// Parameterized Method
    {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

    public static void main(String args[]) {
        Method m = new Method();
        m.set("karim", 1);
        m.display();
    }
}
