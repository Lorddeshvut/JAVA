/*Реализуйте систему на основании паттерна "Прототип" управления игровыми
персонажами, позволяющую клонировать персонажей с разными характеристиками.*/
public class Main {
    public static void main(String[] args) {
        Characters spiritBreaker = new SpiritBreaker("SpiritBreaker", 22.5, 1800, 100, 100);
        Characters jaggernaut = new Jaggernaut("Jaggernaut", 12.3, 1500, 100, 100);
        Characters weaver = new Weaver("Weaver", 18.0, 1000, 100, 100);
        Characters spiritBreakerClone = spiritBreaker.clone();
        Characters jaggernautClone = jaggernaut.clone();
        Characters weaverClone = weaver.clone();
        System.out.println(spiritBreaker);
        System.out.println(jaggernaut);
        System.out.println(weaver);
        System.out.println("Clones:");
        System.out.println(spiritBreakerClone);
        System.out.println(jaggernautClone);
        System.out.println(weaverClone);
    }
}