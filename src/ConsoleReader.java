import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReader {
    //Variables
    final static Scanner sc = new Scanner(System.in);
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //*******************

    //Methods
    public static String ReadViaScanner() {
        try {
            return sc.nextLine();
        }catch (Exception ex){
            return "";
        }

    }
    public static int ReadInt(){
        try {
            return sc.nextInt();
        }catch (Exception ex){
            return 0;
        }
    }

    public static char ReadChar(){
        return  sc.next().charAt(0);
    }

    public static String ReadViaBuffer() {
        try {
            return br.readLine();
        } catch (Exception ex) {
            return "";
        }
    }
    //*******************
}
