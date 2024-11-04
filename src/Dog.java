public class Dog extends Animals{
    private Mood type;
    private int numberVois;

    public Dog(String name, int age, Mood type) {
        super(name, age);
        this.type = type;
    }

    public Dog(String name, int age, Mood type, int numberVois) {
        super(name, age);
        this.type = type;
        this.numberVois = numberVois;
    }

    public int getNumberVois() {
        return numberVois;
    }

    @Override
    void output() {
        System.out.println("Dog's name is " + getName() + ". Is " + getAge() + " years old");
    }

    public void vois() {
        System.out.println("woof");
    }

    public final void vois(int numberVois) {
        for (int i = 0; i < numberVois; i++) {
            System.out.println("woof");
        }
    }
}
