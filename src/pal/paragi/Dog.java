package pal.paragi;

public class Dog extends Animal {  // az extends Animal jelzi a kapcsolatot az Animal class-al

    //csak a kutyára jellemző:
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //az állatokra általánosan jellemző tulajdonságok viszont öröklődnek az Animal classból:
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight); // ezek öröklődtek az Animalból
        this.eyes = eyes; // ezek pedig innentől a Dog saját jellemzői:
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("dog.chew() called");
    }

    @Override //a code / generate / override -ből jött, bekötöttem ide a Animal-ból az eat methode-t
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); // itt hívjuk meg a fenti private methode-t, így válik publikussá
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5); // az Animalból hívtam meg
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(15); //az Animalból hívtam meg
    }
}
