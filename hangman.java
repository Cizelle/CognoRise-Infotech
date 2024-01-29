import java.util.Scanner;

public class level4 {
    public static String[] words = {"hello", "penguin", "programming", "hangman", "computer", "watch"}; // Words to be guessed
    public static String wordChosen;
    public static StringBuilder guessedWord;
    public static int incorrectGuesses;

    public static void main(String[] args) {
        System.out.println("\nTHE GAME BEGINS \n");
        chooseWord();
        guessedWord();

        Scanner sc = new Scanner(System.in);

        while (incorrectGuesses < 6) { // Limiting incorrect guesses to 6 
            hangmanFigure();
            displayGuessedWord();
            System.out.println();

            System.out.print("Enter a letter: "); // Entering user's guesses
            char guess = sc.next().charAt(0);

            //Operations based on user's guess
            if (!userGuess(guess)) {
                incorrectGuesses++;
            }

            if (guessedWord.toString().equals(wordChosen)) {
                System.out.println("Congratulations! You guessed the word: " + wordChosen);
                break;
                
            }
        }

        // Final output - after exhausting all attempts
        if (incorrectGuesses == 6) {
            hangmanFigure();
            System.out.println("\nUh-oh ~ You've run out of attempts. \nThe correct word was: " + wordChosen);
        }

        sc.close();
    }

    public static void chooseWord() { // word to be chosen from the array
        wordChosen = words[(int) (Math.random() * words.length)];
    }

    public static void guessedWord() { // for display
        guessedWord = new StringBuilder();
        for (int i = 0; i < wordChosen.length(); i++) {
            guessedWord.append('_');
        }
    }

    public static void hangmanFigure() {  // Displaying hangman figure after each incorrect guess
        System.out.println("Incorrect Guesses: " + incorrectGuesses);

        switch (incorrectGuesses) {
            case 1:
                System.out.println("  O");
                break;
            case 2:
                System.out.println("  O");
                System.out.println("  |");
                break;
            case 3:
                System.out.println("  O");
                System.out.println(" \\|");
                break;
            case 4:
                System.out.println("  O");
                System.out.println(" \\|/");
                break;
            case 5:
                System.out.println("  O");
                System.out.println(" \\|/");
                System.out.println(" /");
                break;
            case 6:
                System.out.println("  O");
                System.out.println(" \\|/");
                System.out.println(" / \\");
                break;
            default:
                // No hangman figure for 0 incorrect guesses
                break;
        }
    }

    public static void displayGuessedWord() { // Displaying each time after the entered guess
        System.out.println("Current Word: " + guessedWord);
    }

    public static boolean userGuess(char guess) { // algo to decide futrther actions
        boolean correctGuess = false;

        for (int i = 0; i < wordChosen.length(); i++) {
            if (wordChosen.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
                correctGuess = true;
                // true
            }
        }

        return correctGuess;
    }
}
