import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Animal> allAnimals=new ArrayList<>();

        allAnimals.add(new Animal(1,1));
        allAnimals.add(new Bird(1,2,4));
        allAnimals.add(new Fish(3,3));

        moveAnimals(allAnimals);
        feedAnimals(allAnimals);
    }

    private static void feedAnimals(List<Animal> allAnimals) {
        for(Animal animal : allAnimals){
            animal.eat();
        }
    }

    private static void moveAnimals(List<Animal> animals){
        for(Animal animal : animals){
            if(animal instanceof Bird){
                ((Bird) animal).fly();
            }else if(animal instanceof Fish){
                ((Fish) animal).swim();
            }else animal.run();
        }
    }
}
