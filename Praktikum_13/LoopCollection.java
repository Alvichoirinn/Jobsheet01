import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {

        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Strawberry");
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }

        // Convert Stack to ArrayList
        ArrayList<String> fruitList = new ArrayList<>(fruits);

        // Sorting ArrayList
        Collections.sort(fruitList);

        // Convert back to Stack
        Stack<String> sortedFruits = new Stack<>();
        sortedFruits.addAll(fruitList);

        // Print the sorted fruits
        System.out.println("\nData setelah sorting : ");
        for (String fruit : sortedFruits) {
            System.out.printf("%s ", fruit);
        }
    }
}
