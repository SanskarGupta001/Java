public class Inheritance {
    public static void main(String[] args){
        Fish shark=new Fish();
        shark.eat();
        shark.fins=5;
        System.out.println(shark.fins);

    }
}

class Animal{
    Animal(){
        System.out.println("This is constructor");
    }
    void eat(){
        System.out.println("Eats");
    }
    void breadth(){
        System.out.println("breadth");
    }
}

class Fish extends Animal{
    int fins;
    void finscount(int fins){
        this.fins=fins;
    }

}