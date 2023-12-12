public class Weaver extends Characters{
    public Weaver(String name, double speed, int health, int damage, int armor) {
        super(name, speed, health, damage, armor);
    }
    public Weaver(Characters characters) {
        super(characters.getName(), characters.getSpeed(), characters.getHealth(), characters.getDamage(), characters.getArmor());
    }
    @Override
    public Characters clone() {
        return new Weaver(this);
    }
    public String toString() {
        return "Weaver{" +
                "name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", health=" + getHealth() +
                ", damage=" + getDamage() +
                ", armor=" + getArmor() +
                '}';
    }
}
