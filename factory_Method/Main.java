package factory_Method;

public class Main {
    public static void main(String[] args) {
        Character warrior = CharacterFactory.createCharacter("Warrior", "Bogdan");
        Character mage = CharacterFactory.createCharacter("Mage", "Timur");
        Character archer = CharacterFactory.createCharacter("Archer", "Doni");
        warrior.displayInfo();
        mage.displayInfo();
        archer.displayInfo();

        System.out.println("\n=== битва! ===");
        warrior.attack(mage);
        mage.attack(archer);
        archer.attack(warrior);

    }
}
