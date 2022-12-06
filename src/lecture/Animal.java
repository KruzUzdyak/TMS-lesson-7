package lecture;

public class Animal extends Creature {

    public static final boolean IS_ALIVE = true;
    private String color;
    private String gender;

    public Animal() {
    }

    protected Animal(String color, String gender) {
        this();
        this.color = color;
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void eat()  {
        System.out.println("Animal eats");
    }


}
