package person;

public class Employee extends Person {

    private Position position = Position.WORKER;
    private String work;

    public Employee(String name, int age, String work) {
        super(name, age);
        this.work = work;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "work='" + work + '\'' +
                "} " + super.toString();
    }

    // перегруженные методы
    @Override
    protected Boolean sleep(Object hour) {
        System.out.println("employee sleep during work for " + hour);
        return true;
    }

    protected Boolean sleep(int hour) {
        System.out.println("employee sleep during work for " + hour);
        return true;
    }

}
