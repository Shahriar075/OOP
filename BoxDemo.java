
class Box{
    double width,height,depth;
}
public class BoxDemo {
    public static void main(String args[])
    {
        Box mybox=new Box();
        mybox.width=10.5;
        mybox.height=10.5;
        mybox.depth=10.5;
        double vol=mybox.width*mybox.height*mybox.depth;
        System.out.println("Volume "+vol);
    }
}
