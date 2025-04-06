package Encapsulation;

public class Player {

    private String name;
    private int health;

    public Player(String name, int health, String weapon) {
        this.name = name;
        this.health = health<=0?1:(health>100)?100:health;


        this.weapon = weapon;
    }

    private String weapon;



    public void loseHealth(int damage){
        health = health-damage;

        if(health<=0){
            System.out.println("Player is no more ");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extrahealth){
        health +=extrahealth;
        if (health >100){
            System.out.println("player is at full health");
            health=100;
        }
    }

}
