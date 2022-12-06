package person;

public class Main {

    public static void main(String[] args) {
        Person emp1 = new Employee("Petr", 30, "Epam");

        System.out.println(emp1);
        Object sleep = emp1.sleep("4");

        System.out.println(sleep);

        Position manager = Position.MANAGER;
    }
}
