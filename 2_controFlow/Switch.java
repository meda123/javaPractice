public class Switch {
    public static void main(String[] args) {

        char penaltyKick = 'C';

        switch (penaltyKick) {

            case 'L':
                System.out.println("Messi shoots to the left and scores");

            case 'R':
                System.out.println("Messi shoots to the right and misses the goal!");

            case 'C':
                System.out.println("Messi shoots down the center, but the keeper blocks it!");
            default:
                System.out.println("Messi is in position...");

        }   


    }
}