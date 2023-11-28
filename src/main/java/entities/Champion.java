package entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage){
        int effectiveDamage = Math.max(damage - this.armor, 1);
        this.life = Math.max(this.life - effectiveDamage, 0);
    }

    public String status () {
        if (this.life > 0) {
            return name + ": " + life + " de vida";
        } else {
            return name + ": 0 de vida (morreu)";
        }
    }

}
