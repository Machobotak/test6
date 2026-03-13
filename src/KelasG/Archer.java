package KelasG;

public class Archer extends Characters{
    String bowType;
    int arrowCount;

    public Archer(String name, int age, String gender, String bowType, int arrowCount) {
        super(name, age, gender);
        this.setHeroClass("Archer");
        this.bowType = bowType;
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack() {
        System.out.println(getName()+" attack with bow: "+bowType+" arrow count: "+arrowCount);
    }

    public void attack(int numberOfArrows){
        if(numberOfArrows<=0){
            System.out.println("Arrow habis");
        }else{
            --numberOfArrows;
            System.out.println(getName()+" Attack with bow: "+bowType+" remining arrow: "+numberOfArrows);
        }
    }

    @Override
    public void displayInfoChar() {
        super.displayInfoChar();
        System.out.println("Bow Type: " + bowType);
        System.out.println("Arrow Count: " + arrowCount);
    }


}
