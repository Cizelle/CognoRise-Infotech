import java.util.Random;
import java.util.*;
public class level1 {

    public static int user_guess = 0; // Global integer 

    public static void main(String args[]){ // Main Function

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: "); // Range for the guesses 
        int range = sc.nextInt();
        System.out.println("");
    
        Random rand = new Random(); // Generating random integer
        int randint = rand.nextInt(range); 
        
        int i = 0;
        while(i < 5){ // 5 : The pre-defined limit for the guesses

        System.out.print("Enter your guess " + (i+1) + ": "); // Guess by the user
        user_guess = sc.nextInt();
        // Comparing guess within range using function
        if (user_guess <= range) {
            Response(user_guess, randint);
            if(user_guess == randint) break;
        } else {
            System.out.println("Number entered exceeds range.");
            continue;
        }
        i++;
    }
        // Printing the final result
        System.out.println("\nYour guess : " + user_guess);
        System.out.println("Our guess : " + randint);
    } 

    public static void Response(int UserGuess, int SystemGuess){ // Comparing guesses
        if(UserGuess == SystemGuess){
            System.out.println("Your guess is : CORRECT");
        } else if (SystemGuess > UserGuess){
            System.out.println("Your guess is : TOO LOW");
        } else {
            System.out.println("Your guess is : TOO HIGH");
        }
    }  

}

