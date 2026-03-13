package KelasF;

public class Archer extends Characters {
    int arrowCount;
    String bowType;

    public Archer(String name, int age, String gender, int arrowCount, String bowType) {
        super(name, age, gender);
        this.setHeroClass("Archer");
        this.arrowCount = arrowCount;
        this.bowType = bowType;
    }

    @Override
    public void displayInfoChar() {
        super.displayInfoChar();
        System.out.println("Bow: " +bowType );
        System.out.println("Arrows: " +arrowCount);
    }

    @Override
    public void attack() {
        System.out.println(getName()+" attack with bow "+bowType);
    }
    public void attack(int numberOfArrrow){
        if(numberOfArrrow <= 0){
            System.out.println("Arrow count is zero/negative");
        }else{
            --numberOfArrrow;
            System.out.println(getName()+" attack with "+bowType+" with "+numberOfArrrow);
        }
    }
}
