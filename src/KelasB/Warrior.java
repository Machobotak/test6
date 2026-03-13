package KelasB;

public class Warrior extends Characters {
    String weapon;
    String skin;

    public Warrior(String name, int age, String gender, String weapon, String skin) {
        super(name, age, gender);
        this.setHeroClass("warrior");
        this.weapon = weapon;
        this.skin = skin;
    }

    @Override
    public void displayInfoChar() {
        super.displayInfoChar();
        System.out.println("Weapon: "+weapon);
        System.out.println("Skin: "+skin);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " attacks with a "+weapon);
    }

    public void attack(String specialMove){
        System.out.println(getName() + " attacks with a special move: "+specialMove+" with a "+weapon);
    }
}
