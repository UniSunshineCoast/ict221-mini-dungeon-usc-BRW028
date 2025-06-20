package dungeon.engine;

public class Player {
    private String name;
    private int score;
    private int health;
    private int stamina;
    public Player(String name, int score, int health, int stamina) {
        this.name = name;
        this.score = score;
        this.health = health;
        this.stamina = stamina;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public int getHealth(){
        return health;
    }
    public int getStamina() {
        return stamina;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setScore(int score){
        this.score = score;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setStamina(int stamina){
        this.stamina = stamina;
    }
    public void reduceStamina(int stamina){
        this.stamina = stamina -= 1;
        if (this.stamina < 0) this.stamina = 0;
    }

    public void displayPlayerInfo(){
            System.out.println("Player Name: " + name);
            System.out.println("Score: " + score);
            System.out.println("Health: " + health);
            System.out.println("Stamina: " + stamina);
    }
    
}
