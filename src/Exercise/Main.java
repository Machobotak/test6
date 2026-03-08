package Exercise;

public class Main {
    static void main() {
        Characters char1 = new Characters();
        char1.createChar("ayub",19,"mage",false);
        Characters char2 = new Characters();
        char2.createChar("budi",19,"fighter",false);

        System.out.println(char1.getName());
        char1.setName("buya");
        System.out.println(char1.getName());

    }
}
