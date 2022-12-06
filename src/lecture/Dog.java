package lecture;

//ключевое слово extends позволяет наследоваться от другого класса
// и получить  доступ к его полям и методам
public final class Dog extends Animal{

    private String name;
    private String master;

    //конструкторы
    public Dog() {
    }

    public Dog(String color, String gender, String name, String master) {
        super(color, gender);
        this.name = name;
        this.master = master;
    }

    //гет и сет методы
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", master='" + master + '\'' +
                "} " + super.toString();
    }

    public void eat() {
        System.out.println("Dog eats");
    }


}
