package ooP;

abstract class Animal {
    private String name;
    private String type;
    public Animal(String Name,String Type){
        this.name=Name;
        this.type=Type;
    }


    abstract void sound();
   abstract void move();


}
