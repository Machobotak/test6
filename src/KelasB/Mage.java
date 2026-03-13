package KelasB;

public class Mage extends Characters {
    String element;
    float mana;

    public Mage(String name, int age, String gender, String element, float mana) {
        super(name, age, gender);
        this.setHeroClass("Mage");
        this.element = element;
        this.mana = mana;
    }

    @Override
    public void displayInfoChar() {
        super.displayInfoChar();
        System.out.println("Element: " + element);
        System.out.println("Mana: " + mana);
    }

    @Override
    public void attack() {
        System.out.println(getName()+" is attacking with element "+element);
    }

    public void castUltimate(String ultimate) {
        System.out.println("spelling Ultimate: " + ultimate);
    }
}
