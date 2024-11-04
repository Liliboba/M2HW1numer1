//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("King", 5, Mood.GOOD, 5);
        FightingDog dog1 = new FightingDog("Tom", 3, Mood.EVIL);
        FightingDog dog2 = new FightingDog("Jeri", 4, Mood.EVIL);

        Animals[] animals = new Animals[]{dog, dog1, dog2};

        for (int i = 0; i < animals.length; i++) {
            animals[i].output();
            if (animals[i] instanceof FightingDog) {
                ((FightingDog) animals[i]).vois();
            }
            if (animals[i] instanceof Dog) {
                ((Dog) animals[i]).vois(((Dog) animals[i]).getNumberVois());
            }
        }
    }
}