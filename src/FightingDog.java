final class FightingDog extends Dog{
    public FightingDog(String name, int age, Mood type) {
        super(name, age, type);
    }

    @Override
    public void vois() {
        System.out.println("RRRR");
    }
}
