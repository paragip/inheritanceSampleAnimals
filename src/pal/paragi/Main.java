package pal.paragi;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Cat", 1,1,3,2);
        Dog dog = new Dog("Yorkie", 8, 20, 2,4, 2, 4, 1, 16, "long silky");

        dog.eat(); // ez a dog classban nincs, de oda öröklődik az animalból, ezért működik és meghív mindent, ami a dog.eat-tal kapcsolatban van, beleértve az Animal.eat -t, a dog.eat -t és a dog.chew-t is

        dog.walk();
        dog.run();
    }

}
