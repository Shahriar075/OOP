
class Stack {
    int stck[] = new int[100];
    int pos;

    Stack() {
        pos = 0;
    }

    void push(int item) {
        if (pos > 9)
            System.out.println("Stack is full!");
        else {
            stck[pos] = item;
            pos++;
        }
    }

    int pop() {
        if (pos < 0) {
            System.out.println("Stack is empty!");
            return 0;
        } else {
            return stck[--pos];
        }
    }

    public static void main(String args[]) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }
        System.out.println("mystack1 elements: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("mystack2 elements: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
