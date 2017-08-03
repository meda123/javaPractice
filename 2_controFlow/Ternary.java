public class Ternary {
    public static void main (String[] args) {

        int fuelLevel = 3;
        
        char canDrive = (fuelLevel>0) ? 'Y':'N';

        System.out.println(canDrive);

    }
}

// Prints Y


/*
Ternary Conditional: Allows us to write if/else statements in a single line 
Three parts: 
    Boolean expression
    Single statement that gets executed if the Boolean expression is true 
    A single statement that gets executed if the Boolean expression is false  



*/