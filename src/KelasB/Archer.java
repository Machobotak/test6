package KelasB;

public class Archer extends Characters {
    String bowType;
    int arrowCount;

    public Archer(String name, int age, String gender, String bowType, int arrowCount) {
        super(name, age, gender);
        this.setHeroClass("Archer");
        this.bowType = bowType;
        this.arrowCount = arrowCount;
    }

    @Override
    public void displayInfoChar() {
        super.displayInfoChar();
        System.out.println("Bow Type: " + bowType);
        System.out.println("Arrow Count: " + arrowCount);
    }

    @Override
    public void attack() {
        if(arrowCount <=0){
            System.out.println("Arrow Count is Zero");
        }else{
            arrowCount--;
            System.out.println(getName() + " is attacking"+" with a "+bowType+ " remining arrow: "+arrowCount);
        }

    }
}
