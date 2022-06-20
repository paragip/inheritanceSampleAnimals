package pal.paragi;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight); // ezek öröklődnek az Anibam classból
        this.gills = gills; // ezek pedig a Fish saját jellemzői:
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){



    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles(); // meghívja a két fenti mozgást
        moveBackFin();
        super.move(speed); // ezt az Animal classból hívja meg
    }

}
