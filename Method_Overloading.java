public class Method_Overloading {
    public static void main(String[] args){
        Calculator add=new Calculator();
        System.out.println(add.sum(4,8));
        System.out.println(add.sum(4,8,10));
        System.out.println(add.sum(4.5F,8.6F));
        System.out.println(add.sum(4.5F,8.6F,10.6F));

    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    float sum(float a,float b,float c){
        return a+b+c;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }
}