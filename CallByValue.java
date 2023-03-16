
//package oop;

public class CallByValue {
    String name;
    void change(String n)
    {
        n="Karim";
    }
    public static void main(String args[])
    {
        CallByValue c=new CallByValue();
        String s="Rahim";
        System.out.println("Before changing: "+s);
        c.change(s);
        System.out.println("After changing: "+s);

    }
}

