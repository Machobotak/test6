package KelasB;

public class Main {
    static void main() {
        Archer archer1 = new Archer("ayub",19,"male","ice bow",12);
        archer1.displayInfoChar();
        archer1.attack();
        System.out.println();

        Mage mage1 = new Mage("Ayub",19,"male","fire",1000);
        mage1.displayInfoChar();
        mage1.attack();
        mage1.castUltimate("Explosion");
        System.out.println();

        Warrior warrior1 = new Warrior("ayub",19,"male","excalibur","gold");
        warrior1.displayInfoChar();
        warrior1.attack();
        warrior1.attack("salto");
    }
}
