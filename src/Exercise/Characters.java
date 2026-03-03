package Exercise;

public class Characters {
    private String name;
    private int age;
    private String heroClass;
    private boolean gender;//true female false male

    public void createChar(String name, int age, String heroClass, boolean gender) {
        this.name = name;
        this.age = age;
        this.heroClass = heroClass;
        this.gender = gender;

        displayCharinfo();
    }

    public void displayCharinfo(){
        System.out.println("===Character Information===");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Hero Class: " + getHeroClass());
        System.out.println("Gender: " + isGender());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
