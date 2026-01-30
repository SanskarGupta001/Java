import java.util.Scanner;

public class Recusive_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a=sc.nextInt();
        System.out.println("Factorial of "+ a +"is : "+Factorial(a));

    }
    public static int Factorial(int num){
        if(num ==1){
            return 1;
        }else {
            return num*Factorial(num-1);

        }

    }

}
