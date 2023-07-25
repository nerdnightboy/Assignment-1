import java.util.Scanner;

class Square{
    float length;
    float area;
    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of square: ");
        length = sc.nextFloat();
    }
    public void compute(){
        area = length * length;
    }
    public void display(){
        System.out.println("The area of Square is: " + area);
    }
}
class Rectangle{
    float length;
    float breadth;
    float area;
    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        breadth = sc.nextFloat();
    }
    public void compute(){
        area = length * breadth;
    }
    public void display(){
        System.out.println("The area of Rectangle is: " + area);
    }
}

class Circle{
    float radius;
    float area;
    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        radius = sc.nextFloat();
    }
    public void compute(){
        area = 3.141f * radius * radius;
    }
    public void display(){
        System.out.println("The area of Circle is: " + area);
    }
}


public class LengthFindingWithoutOOPs{
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        s.acceptInput();
        s.compute();
        s.display();

        r.acceptInput();
        r.compute();
        r.display();

        c.acceptInput();
        c.compute();
        c.display();
    }
}