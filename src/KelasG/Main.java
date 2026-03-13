package KelasG;

public class Main {
    static void main() {
        Archer archer1 = new Archer("ayub",19,"male","ice",12);
        archer1.displayInfoChar();
        archer1.attack();
        archer1.attack(12);
        System.out.println();

        Warrior warrior1 = new Warrior("ayub",19,"male","Excalibur","gold");
        warrior1.displayInfoChar();
        warrior1.attack();
        warrior1.attack("salto");
        System.out.println();

        Mage mage1 = new Mage("ayub",19,"male","fire",1000);
        mage1.displayInfoChar();
        mage1.attack();
        mage1.castUltimateSpell("Explosion");
    }
}
