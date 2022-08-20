/* 1. Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
- method of parent class by object of parent class
- method of child class by object of child class
- method of parent class by object of child class
*/

class parent {
    public void print() {
        System.out.println("This is parent class");
    }
}

class child extends parent {
    public void print() {
        System.out.println("This is child class");
    }
}

class inheritance {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();
        parent pc = new child();

        p.print();
        c.print();
        pc.print();

    }
}