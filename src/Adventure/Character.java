package Adventure;

import Adventure.Enums.Category;

public class Character extends Entity {
    private int level;
    private Category category;
    private String weapon;

    public Character(String name, int life, int strength, int level, Category category, String weapon) {
        super(name, life, strength);
        this.level = level;
        this.category = category;
        this.weapon = weapon;
    }

    //Getters


    public int getLevel() {
        return level;
    }

    public Category getCategory() {
        return category;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public void attack(Entity npc) {
        int characterLife = this.life;
        int npcLife = npc.life;
        boolean turn = false;

        while (characterLife > 0 && npcLife > 0) {

            if (!turn) {
                npcLife -= this.strength;
                turn = true;

            } else {
                characterLife -= npc.strength;
                turn = false;
            }
        }

        if (characterLife > 0) {
            this.level++;
            this.life = this.life + (this.life * 10 / 100);
            this.strength = this.strength + (this.strength * 10 / 100);

            System.out.println("✌️🔥 Parabéns " + this.category + " " + this.name +
                    " 🔥✌️\nGanhou um combate contra um " + npc.name +
                    " com o uso da arma " + this.weapon + "!");

            System.out.print("Vida: " + this.life);
            System.out.print(" | Força: " + this.strength);
            System.out.println(" | Nível: " + this.level);
            System.out.println("---------------------------------------------------------------------");

        } else {
            System.out.println("You loose! 😭");
            System.out.println("---------------------------------------------------------------------");

        }
    }
}
