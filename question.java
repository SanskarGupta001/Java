import java.util.*;

public class question {
    public static void main(String[] args){
        System.out.println("----Newton's Second Law----");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter time:-");
        double t=sc.nextDouble();
        System.out.print("Enter initial speed:-");
        double i=sc.nextDouble();
        System.out.print("Enter accelration:-");
        double a=sc.nextDouble();
        double s=i*t+(0.5*a*(Math.sqrt(t)));
        System.out.println("Answer:"+s);
    }
}
