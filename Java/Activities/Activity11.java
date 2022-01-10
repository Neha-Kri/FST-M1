package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
    	
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Violet");
        hash_map.put(2, "Indigo");
        hash_map.put(3, "Black");
        hash_map.put(4, "Green");
        hash_map.put(5, "Yellow");

        // Print the Map
        System.out.println("The Original map: " + hash_map);
        
        // Remove one colour
        hash_map.remove(4);
        // Map after removing a colour
        System.out.println("After removing White: " + hash_map);
        
        // Check if green exists
        if(hash_map.containsValue("Indigo")) {
            System.out.println("Indigo exists in the Map");
        } else {
            System.out.println("Indigo does not exist in the Map");
        }
        
        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + hash_map.size());
    }
}