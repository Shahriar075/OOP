class Person {
    String name;
    int id;

    void display() {
        System.out.println("Name " + name);
        System.out.println("Id " + id);
    }
}

class Student extends Person {
    void display2() {
        System.out.println("Name " + name);
        System.out.println("Id " + id);
    }
}

class Inheritance {
    public static void main(String args[]) {
        Student s = new Student();
        s.id = 1;
        s.name = "Abdul";
        s.display();
    }
}
