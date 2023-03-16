
class Box2 {
    double width, height, depth;

    Box2(double w, double h, double d)// Parameterized constructor
    {
        width = w;
        height = h;
        depth = d;
    }

    void display() {
        System.out.println("Volume " + width * height * depth);
    }

    public static void main(String args[]) {
        Box2 mybox = new Box2(5, 10, 15);
        mybox.display();
    }
}

public class Constructor {

}
