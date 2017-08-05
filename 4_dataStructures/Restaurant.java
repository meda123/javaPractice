import java.util.HashMap;

public class Restaurant {
    public static void main (String[] args) {

    HashMap<String, Integer> restaurantMenu = new 
    HashMap<String, Integer>();


    // We use the .put method to add items to dictionary/hashmap 
    restaurantMenu.put("Turkey Burger", 13);
    restaurantMenu.put("Naan Pizza", 11);
    restaurantMenu.put("Cranberry Kale Salad", 10);  

    //We "grab" value of speficic key with .get method 
    System.out.println(restaurantMenu.get("Naan Pizza"));

    // What is the size of our restaurantMenu hashmap? 
    System.out.println("Size of restaurantMenu hashmap is " + restaurantMenu.size());

    // Cool: how we iterate over the restaurantMenu hashmap 

    for (String item: restaurantMenu.keySet()) {
        System.out.println("A " + item + "costs " + restaurantMenu.get(item));
    }  



    }
}




/*




*/