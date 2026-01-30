package rectange;

public class Rectangle extends shape{
    public int breadth;
    public int length;

    public Rectangle(int breadth, int length){// contructor
        super();
        this.breadth=breadth;
        this.length=length;
        System.out.println("This is happen by constructor of Rectangle");
    }
    public void rectanglearea(){
        System.out.println("The area of rectangle is: " + (length*breadth) );
    }
}
