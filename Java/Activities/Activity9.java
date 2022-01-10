package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
    	
        //declaring arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        
        //Adding objects to Array List at default index
        myList.add("Kiwi");
        myList.add("Dragon Fruit");
        myList.add("Chicku");
        
        //Adding object at specific index
        myList.add(3, "Grapes");
        myList.add(1, "Avacado");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Avacado");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}