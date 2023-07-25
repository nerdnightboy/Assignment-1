import java.util.Scanner;

abstract class Shape{ 
    float area;
    String name;
    abstract void acceptInput();
    abstract void compute();
    abstract void setName();
    public void display(){
        System.out.println("The area of " + name +" is: " + area);
    };
}

class Square extends Shape{ 
    private float length;
    @Override 
    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of square: ");
        length = sc.nextFloat();
    }
    @Override 
    public void compute(){
        area = length * length;
    }
    public void setName(){
        name = "Square";
    }
}

class Rectangle extends Shape{ 
    private float length;
    private float breadth;
    @Override 
    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        length = sc.nextFloat();
        System.out.println("Enter the breadth of rectangle: ");
        breadth = sc.nextFloat();
    }
    @Override 
    public void compute(){
        area = length * breadth;
    }
    public void setName(){
        name = "Rectangle";
    }
}

class Circle extends Shape{
    private float radius;
    @Override
    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        radius = sc.nextFloat();
    }
    @Override 
    public void compute(){
        area = 3.141f * radius * radius;
    }
    public void setName(){
        name = "Circle";
    }
}

class Geometry{
    public void permit(Shape ref){
        ref.acceptInput();
        ref.compute();
        ref.setName();
        ref.display();
    }
}

public class LengthFindingWithOOPs {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Geometry g = new Geometry();

        g.permit(s);
        g.permit(r);
        g.permit(c);
    }
}