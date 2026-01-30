public class OOPS {
    public static void main(String[] args){
        Pen hello=new Pen();
        hello.changecoulour("blue");
        System.out.println(hello.colour);
        hello.changetip(5);
        System.out.println(hello.tip);

    }
}

class Pen{
    String colour;
    int tip;
    void changecoulour(String colour){
        this.colour=colour;

    }
    void changetip(int tip ){
        this.tip=tip;
    }

}
