package ooP;

public class Dog extends Animal {


    public Dog(String Name,String Type){
        super("Dog","xxx");


    }
    @Override
    void sound() {
        System.out.println("bark bark");
    }
    void move(){
        System.out.println("i have four legs");
    }
}
