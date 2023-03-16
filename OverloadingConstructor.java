class Student {
    String name;
    int id;

    Student() {
        System.out.println("No information available");
    }

    Student(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Rahim", 2);
        s2.display();
    }
}
