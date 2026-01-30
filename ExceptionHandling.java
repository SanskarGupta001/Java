import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();//0 put karne se exception aa jayega kyuki undefined hota hai

        try {
            System.out.println("The answer of the division is: "+(a/b));
        } catch (Exception e) {
            System.out.println("Not possible please change the number of dinominator");
        }finally {
            System.out.println("This is final!");
        }
    }
}
