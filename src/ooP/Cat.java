package ooP;

public class Cat extends Animal{
    public Cat(String Name, String Type) {
        super("Cat", "yyy");
    }


    void sound(){
        System.out.println("meow meow");
    }

    @Override
    void move() {
        System.out.println("i have four legs");
    }
}
