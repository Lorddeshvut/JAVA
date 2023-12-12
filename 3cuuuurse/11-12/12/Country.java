import java.util.ArrayList;

public class Country extends Component{
    ArrayList<Component> components = new ArrayList<Component>();
    public Country(String name, int capital, int population) {
        super(name, capital, population);
        this.name = name;
        this.capital = capital;
        this.population = population;
    }
    @Override
    public void print() {
        System.out.println("Country: " + name + ", capital: " + capital + ", population: " + population);
        for (Component component : components) {
            component.print();
        }
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }
}
