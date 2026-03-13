package Exercise;

public class Archer extends Characters {
    int arrowCount;
    String bowType;

    public Archer(String name, int age, boolean gender, int arrowCount, String bowType) {
        super(name, age, gender);
        this.setHeroClass("Archer");
        this.arrowCount = arrowCount;
        this.bowType = bowType;
    }

    @Override
    public void displayCharInfo() {
        super.displayCharInfo();
        System.out.println("Bow Type: " + bowType);
        System.out.println("Arrow Count: " + arrowCount);
    }

    @Override
    public void attack() {
        if (arrowCount <= 0) {
            System.out.println(getName() + " cannot attack. No arrows left.");
            return;
        }

        arrowCount--;
        System.out.println(getName() + " is attacking with " + bowType + ". Remaining arrows: " + arrowCount);
    }

}
