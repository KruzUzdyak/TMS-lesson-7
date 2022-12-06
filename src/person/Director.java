package person;

public class Director extends Employee {

    public Director(String name, int age, String work) {
        super(name, age, work);
        setPosition(Position.DIRECTOR);
    }

    @Override
    public Boolean sleep(Object hour) {
        System.out.println("Director sleeps now for " + hour);
        return true;
    }
}
