package lecture;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("black", "male",
                5, "Anton");

        cat1.eat();


        Animal animalCat = new Cat("red",  "female",
                2, "Maruysya");
        Animal animalDog = new Dog();
        animalCat.eat();
        animalDog.eat();

        cat1.setAge(46);
        int catAge  = cat1.getAge();

        Creature creatureAnimal = new Animal("red",  "male");

        Creature.print(cat1);
        Creature.print(animalDog);
        Creature.print(creatureAnimal);
        System.out.println();
    }
}
