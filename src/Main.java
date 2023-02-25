import org.eribert.collections.set.HashSetExample;

public class Main {
    public static void main(String[] args) {

        // We can't repeat elements
        System.out.println("\nSets... \n");
        HashSetExample.example();
        String[] elements = {"Chicken", "Chicken", "red", "blue", "red", "green"};
        HashSetExample.duplicated(elements);

    }
}