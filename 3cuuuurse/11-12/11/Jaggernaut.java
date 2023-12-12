public class Jaggernaut extends Characters{
    public Jaggernaut(String name, double speed, int health, int damage, int armor) {
        super(name, speed, health, damage, armor);
    }
    public Jaggernaut(Characters characters) {
        super(characters.getName(), characters.getSpeed(), characters.getHealth(), characters.getDamage(), characters.getArmor());
    }
    @Override
    public Characters clone() {
        return new Jaggernaut(this);
    }
    public String toString() {
        return "Jaggernaut{" +
                "name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", health=" + getHealth() +
                ", damage=" + getDamage() +
                ", armor=" + getArmor() +
                '}';
    }
}
