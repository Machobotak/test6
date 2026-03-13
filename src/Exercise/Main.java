package Exercise;

public class Main {
    static void main() {
        Archer archer1 = new Archer("Ayub",12,false,12,"ice");
        archer1.displayCharInfo();
        archer1.attack();
        System.out.println();

        Warrior warrior1 = new Warrior("Ayub",12,false,"excalibur","gold");
        warrior1.displayCharInfo();
        warrior1.attack();
        warrior1.attack("salto");
        System.out.println();

        Mage mage1 = new Mage("Ayub",12,false,"fire",100000);
        mage1.displayCharInfo();
        mage1.attack();
        mage1.castUltimateSpell("Explosion");
        System.out.println();

    }
}
