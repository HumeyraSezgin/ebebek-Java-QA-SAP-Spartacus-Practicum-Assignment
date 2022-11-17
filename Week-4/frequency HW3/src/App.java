import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 10, 20, 20, 10, 10, 20, 5, 20 };
        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
        for (int i = 0; i < arr.length; i++) {
            if (!hmap.containsKey(arr[i])) {
                hmap.put(arr[i], 1); // first addition
            } else {
                int count = (int) hmap.get(arr[i]); // other addition, counter++
                hmap.put(arr[i], count + 1);
            }
        }
        System.out.print("Array: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println("\nFrequencies are: ");
        for (Object objectName : hmap.keySet()) { // print
            System.out.println("Number " + objectName + " was repeated " + hmap.get(objectName) + " times");
        }
    }
}
