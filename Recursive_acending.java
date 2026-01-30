import java.util.Scanner;

public class Recursive_acending {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number:");
        int a=sc.nextInt();
        System.out.print("Enter end number: ");
        int b=sc.nextInt();
        Printnumber(a,b);
    }

    public static void Printnumber(int num1, int num2){
        if (num1==num2){
            System.out.println(num1);
        }else {
            System.out.print(num1+" ");
            Printnumber(num1+1,num2);
        }

    }
}
