package factory_Method;

public class Warrior implements Character{
    private String name;
    private int health;
    private int damage;
    private int defense;

    public Warrior(String name) {
        this.name = name;
        this.health = 200;
        this.damage = 20;
        this.defense = 50;


    }

    @Override
    public void attack(Character target){
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage){
        int damageReceived = Math.max(damage - defense, 20);
        health -= damageReceived;
        System.out.println(name + " takes " + damageReceived + " damage health: " + health);

    }

    @Override
    public void displayInfo(){
        System.out.println(name + " | health: " + health + " | damage: " + damage);
    }
}
