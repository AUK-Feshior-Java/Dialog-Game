import java.util.Random;
import java.util.zip.GZIPInputStream;

public class GuessNumber {
    //Variables
    private Random random;
    private int NumberToGuess=-1;
    private int CurrentAttempts;

    //CurrentAttempts getter
    public int getAttempts(){
        return CurrentAttempts;
    }

    //*******************

    //Methods
    public void ReloadGame(){
        random = new Random();
        NumberToGuess = random.nextInt(1000);
        CurrentAttempts=0;
    }
    public GuessNumber(){
        ReloadGame();
    }

    public GuessVariants guessNumber(int inputNumber){
        CurrentAttempts++;
        if(inputNumber>NumberToGuess)
            return GuessVariants.Less;

        else if(inputNumber<NumberToGuess)
            return GuessVariants.More;

        return GuessVariants.Correct;
    }


    //************************

}
