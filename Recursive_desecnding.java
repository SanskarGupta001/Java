import java.util.Scanner;

public class Recursive_desecnding {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();
        PrintNumber(a);

    }
    public static void PrintNumber(int num){
        if(num==1){
            System.out.println("1");
            return;
        }else{
            System.out.print(num+" ");
            PrintNumber(num-1);
        }
    }
}
