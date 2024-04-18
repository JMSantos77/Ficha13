package Adventure;

public abstract class Entity {
    protected String name;
    protected int life;
    protected int strength;

    public Entity(String name, int life, int strength) {
        this.name = name;
        this.life = life;
        this.strength = strength;
    }

    public abstract void attack(Entity entity);
}
