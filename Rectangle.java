/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square. */

class Square extends Rectangle {

    Square(float length, float breadth) {
        super(length, breadth);
        System.out.println("Area of Square: " + length * length);
        System.out.println("Paramenter of Square: " + 4 * length);
    }
}

class Rectangle {
    float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    public void parameter() {
        System.out.println("Parameter of Rectangle: " + 2 * (length + breadth));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(15, 60);
        r.area();
        r.parameter();

        Square s = new Square(20, 30);

    }

}