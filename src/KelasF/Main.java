package KelasF;

public class Main {
    static void main() {
        Warrior warrior1 = new Warrior("Ayub",19,"Male","Excalibur","gold");
        warrior1.displayInfoChar();
        warrior1.attack();
        warrior1.attack("Salto");
        System.out.println();

        Archer archer1 = new Archer("Ayub",19,"male",12,"ice");
        archer1.displayInfoChar();
        archer1.attack();
        archer1.attack(12);
        System.out.println();

        Mage mage1 = new Mage("Ayub",19,"Male","fire",1000);
        mage1.displayInfoChar();
        mage1.attack();
        mage1.castUltimateSpell("Explosion");
    }
}
