import java.util.ArrayList;

public class Temperatures {

    public static void main(String[] args) {

    ArrayList<Integer> weeklyTemperatures = new 
    ArrayList<Integer>();

    weeklyTemperatures.add(78);
    weeklyTemperatures.add(67);
    weeklyTemperatures.add(89);
    weeklyTemperatures.add(94);

    // To grab a specific item inside a list, use .get method and it's position
    //Prints out 67 
    System.out.println(weeklyTemperatures.get(1));
   
    // Adds 111 at index 2 
    weeklyTemperatures.add(2, 111);
    

    // Here is how we loop through the list we just created 

    for (int j = 0; j< weeklyTemperatures.size(); j++ ) {
        System.out.println(weeklyTemperatures.get(j));
    } 

    // But here is a cooler way to loop through, shortcut yassss :) 

    for (Integer temperature : weeklyTemperatures) {
        System.out.println("cool way to print temperature " + temperature);
    }




    }
}




/*
ArrayList is a built-in data structure.
It stores a list of data of a specific type. 






*/