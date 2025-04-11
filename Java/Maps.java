import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {

        Map<String,Integer> colors = new HashMap<>();
        System.out.println("My Empty Map:"+colors);
        colors.put("RED", 1);
        colors.put("Yellow", 2);
        colors.put("Blue", 3);
        colors.put("Green", 4);
        colors.put("White", 5);

        System.out.println("My after put Map:"+colors);
        colors.remove("RED");
        System.out.println("My after remove Map:"+colors);
        for (Map.Entry<String, Integer> entry : colors.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        Map<String, Integer> flowers = new TreeMap<>();

        System.out.println("My Empty Map: " + flowers);

        flowers.put("Rose", 1);
        flowers.put("Lily", 2);
        flowers.put("Tulip", 3);
        flowers.put("Daisy", 4);
        flowers.put("Orchid", 5);

        System.out.println("My after put Map: " + flowers);

        flowers.remove("Rose");
        System.out.println("My after remove Map: " + flowers);

        for (Map.Entry<String, Integer> entry : flowers.entrySet()) {
            System.out.println("Flower: " + entry.getKey() + ", Number: " + entry.getValue());
        }






    }



}
