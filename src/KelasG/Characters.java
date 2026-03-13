package KelasG;

public class Characters {
    private String name;
    private int age;
    private String heroClass;
    private String gender;

    public Characters(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfoChar(){
        System.out.println("====Character Information====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hero Class: " + heroClass);
        System.out.println("Gender: " + gender);
    }

    public void attack(){

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
