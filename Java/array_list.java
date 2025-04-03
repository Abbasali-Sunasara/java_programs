import java.util.ArrayList;
import java.util.List;

public class array_list {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        fruits.add("Watermelon");
        fruits.add("Cherry");
        fruits.add("Papaya");

        System.out.println("Fruits List: " + fruits);
        System.out.println("\n");
        System.out.println("\n");
        for (String f : fruits){

            System.out.println(" fruits using iterator :-"+f);
        }
    }




}
