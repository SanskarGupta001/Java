package rectange;

public class circle {
    private static final float Pi=3.14F;

    private int radius;

    public circle(int radius){
        this.radius=radius;
        System.out.println("I am in the constructor of Circle");

    }
    public void draw(){
        System.out.println("Draw a circle");
    }
    public void area(){
        System.out.println("Area of a circle: "+(2*Pi*radius));
    }
}
