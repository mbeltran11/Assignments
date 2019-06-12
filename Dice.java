// Manuel Beltran
// Jaelin Williams
// Adrian Woods
public class Dice {
	public static void main(String[] args) {
	int point = -1; 
    	int roll = (int)(Math.random()* 11 + 2); 
    	System.out.println("Roll total: " + roll);
 
	if(roll == 7 || roll == 11){
            System.out.println("You win");
        System.exit(0);
		}
   	else if(roll == 2 || roll == 3 || roll == 12){
        System.out.println("You lose");
        System.exit(0);
		}
        if (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 10 || roll == 9){
        point = roll;
        }
        if (roll == 4 || roll == 5 || roll == 6 || roll == 8 || roll == 10 || roll == 9);
        roll = (int)(Math.random()* 11 + 2);
        while (roll != point) {
			roll = (int)(Math.random()* 11 + 2);
			System.out.println("Roll total: " + roll);
			if (roll == point){
				System.out.println ("You win");
			}
            else if (roll == 7){
                System.out.println("You lose");
                System.exit(0);
            }
		}
 	}
}
