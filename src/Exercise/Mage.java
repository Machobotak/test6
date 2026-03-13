package Exercise;

public class Mage extends Characters {
    String element;
    float mana;

    public Mage(String name, int age, boolean gender, String element, float mana) {
        super(name, age, gender);
        this.setHeroClass("Mage");
        this.element = element;
        this.mana = mana;
    }


    @Override
    public void displayCharInfo() {
        super.displayCharInfo();
        System.out.println("Element: " + element);
        System.out.println("Mana: " + mana);
    }

    @Override
    public void attack() {
        System.out.println(getName()+ " Attack with element: " + element);
    }

    public void castUltimateSpell(String ultimateSpell) {
        System.out.println("Casting ultimate spell: "+ultimateSpell);
    }


}
