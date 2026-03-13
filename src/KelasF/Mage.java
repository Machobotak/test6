package KelasF;

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
        System.out.println(getName()+" attack with element: "+element+" and mana: "+mana);
    }

    public void castUltimateSpell(String ultimate){
        System.out.println("Ultimate Spell Casting: " + ultimate);
    }
}
