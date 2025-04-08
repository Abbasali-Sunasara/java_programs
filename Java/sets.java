import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class sets {
    public static void main(String[] args) {

        System.out.println("Using HashSet");
        Set<String> cars = new HashSet<>();
        System.out.println("My Empty Set: " + cars);

        cars.add("Toyota");
        cars.add("Honda");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Tesla");

        System.out.println("My Car Set: " + cars);
        for(String new1: cars){

            System.out.println("cars using iterator:-"+new1);

        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Using Tree set");
        Set<String> flowers = new TreeSet<>();
        System.out.println("My Empty Set: " + flowers);

        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Tulip");
        flowers.add("Daisy");
        flowers.add("Orchid");

        System.out.println("My Flower Set: " + flowers);
        for (String flower : flowers) {
            System.out.println("Flowers using iterator: " + flower);
        }













    }
}
