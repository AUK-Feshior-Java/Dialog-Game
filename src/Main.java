import java.io.Console;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your personal information step by step");
        System.out.print("Enter your name: ");
        String name = ConsoleReader.ReadViaBuffer();
        System.out.print("Enter your surname: ");
        String surname = ConsoleReader.ReadViaScanner();
        System.out.print("Enter your age: ");
        int age = ConsoleReader.ReadInt();
        System.out.println("Lets play the game");
        System.out.println("Guess the number. Tip: number is more than 0, but less than 1000");


        GuessNumber gn = new GuessNumber();
        int number = -1;
        GuessVariants answer = GuessVariants.Less;

        while (answer!=GuessVariants.Correct){

            System.out.print("Enter number: ");
            number = ConsoleReader.ReadInt();
            answer = gn.guessNumber(number);

            if(answer == GuessVariants.Less)
                System.out.println("Number is less than " + number);
            else
                System.out.println("Number is more than " + number);
        }
        System.out.println("You guessed! Correct number is " + number);
        System.out.println(name + " " + surname + " it took you " + gn.getAttempts() + " Attempts to beat the game!") ;
    }
}