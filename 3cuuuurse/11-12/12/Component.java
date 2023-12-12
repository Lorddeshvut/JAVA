public abstract class Component {
    protected String name;
    protected int capital;
    protected int population;

    public Component(String name, int capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }
    public abstract void print();

    public abstract void add(Component component);

    public abstract void remove(Component component);

}
