package Exercise;

public class Main {
    static void main() {
        Characters characters1 = new Characters();
        characters1.createChar("ayub",19,"mage",false);
        System.out.println("Characters created successfully");
        Characters characters2 = new Characters();
        characters2.createChar("budi",19,"fighter",false);

        characters1.setHeroClass("Assasin");
        characters1.displayCharinfo();
        System.out.println(characters1.getName());
    }
}
