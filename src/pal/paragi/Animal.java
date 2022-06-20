package pal.paragi;

public class Animal {
    // minden állatra jelemző:
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //ezt a viselkedést is meg lehet hívni a Dog classból, mivel public:
    public void eat() {
        System.out.println("animal.eat() called");
    }

    public void move(int speed){
        System.out.println("Animal is moving at " + speed);
    }


    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
