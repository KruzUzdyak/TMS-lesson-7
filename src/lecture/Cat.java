package lecture;

public final class Cat extends Animal {

    private int age;
    private String name;

    public Cat () {
    }

    protected Cat(String color, String gender, int age, String name) {
        super(color, gender);
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        calculateAge();
        return age;
    }

    private int calculateAge(){
        //calculate age using current date
        return 10;
    }

    public void setAge(int age) {
        if (age < 30) {
            this.age = age;
        }
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }


    public void makeUrr(){
        System.out.println("urr");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }


    public void eat(String string) {
        System.out.println("Cat eats");
    }
}
