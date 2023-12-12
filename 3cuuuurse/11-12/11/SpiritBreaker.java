public class SpiritBreaker extends Characters{
    public SpiritBreaker(String name, double speed, int health, int damage, int armor) {
        super(name, speed, health, damage, armor);
    }
    public SpiritBreaker(Characters characters) {
        super(characters.getName(), characters.getSpeed(), characters.getHealth(), characters.getDamage(), characters.getArmor());
    }
    @Override
    public Characters clone() {
        return new SpiritBreaker(this);
    }
    public String toString() {
        return "SpiritBreaker{" +
                "name='" + getName() + '\'' +
                ", speed=" + getSpeed() +
                ", health=" + getHealth() +
                ", damage=" + getDamage() +
                ", armor=" + getArmor() +
                '}';
    }
}
