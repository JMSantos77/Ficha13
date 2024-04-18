package Adventure;

import Adventure.Enums.Category;

public class Main {
    public static void main(String[] args) {
        Character merlin = new Character("Merlin", 20, 10, 1, Category.WIZARD, "Cajado Mágico");

        Npc orc = new Npc("Orc", 18, 9);
        Npc ooze = new Npc("Ooze", 19, 10);
        Npc skeleton = new Npc("Skeleton", 20, 11);

        //Batalha contra 3 adversários
        merlin.attack(orc);
        merlin.attack(ooze);
        merlin.attack(skeleton);
    }
}
