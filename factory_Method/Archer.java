package factory_Method;

public class Archer implements Character{
    private String name;
    private int health;
    private int damage;
    private int defense;

    public Archer(String name) {
        this.name = name;
        this.health = 200;
        this.damage = 15;
        this.defense = 50;


    }

    @Override
    public void attack(Character target){
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage){
        int damageReceived = Math.max(damage - defense, 15);
        health -= damageReceived;
        System.out.println(name + " takes " + damageReceived + " damage health: " + health);

    }

    @Override
    public void displayInfo(){
        System.out.println(name + " | health: " + health + " | damage: " + damage);
    }
}
