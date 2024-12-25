import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class RandomizedSet {
    private HashMap<Integer, Integer> map;
    private ArrayList<Integer> list;
    private Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        // If the value is already in the set, return false
        if (map.containsKey(val)) {
            return false;
        }
        // Add the value to the ArrayList and store its index in the HashMap
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        // If the value is not in the set, return false
        if (!map.containsKey(val)) {
            return false;
        }
        
        // Get the index of the value to be removed
        int index = map.get(val);
        
        // Swap the value to be removed with the last element in the ArrayList
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);
        map.put(lastElement, index);  // Update the index of the last element
        
        // Remove the last element from the ArrayList
        list.remove(list.size() - 1);
        map.remove(val);  // Remove the value from the HashMap
        return true;
    }
    
    public int getRandom() {
        // Return a random element from the ArrayList
        return list.get(random.nextInt(list.size()));
    }
}
