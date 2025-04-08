import java.util.List;
import java.util.LinkedList;



public class Linkedlist {
    public static void main(String[] args) {
        List<String> heros = new LinkedList<>();
        System.out.println("My LinkedList:"+heros);
        heros.add("NTR");
        heros.add("ANR");
        heros.add("NBK");
        heros.add("NKR");
        heros.add("Ram Charan");
        System.out.println("MY linkedList After Adding :"+heros);
        heros.remove(4);
        System.out.println("MY Removed Linked List:"+heros);
        String temp = heros.get(0);
        System.out.println("MY LinkedList After adding :"+temp);

        for (String hero : heros){

            System.out.println("My linked list using iterator"+hero);
        }
        heros.add("Allu Arjun");
        System.out.println("My linked list after adding"+heros);
        





    }
}