import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Exceptions {

    static String str;
    static int[] array;

    public static void main(String[] args) {
        try {
            str.isEmpty();  // blok try, metoda powodująca exception
        } catch (NullPointerException e) {   // blok catch
            System.out.println("Error !");
        }

        try {
            array[0] = 1;  // wyskoczy exception
            array[1] = 2;
        } catch (NullPointerException e) { // nazwa wylapanego exceptiona
            System.out.println("Create array !");
        } catch (ArrayIndexOutOfBoundsException e) { // blok catch moze mieć wiecej niz 1 exception
            System.out.println("Out of array !");
        } finally {
            System.out.println("From finally block"); // wykona się bez względu na wykrycie lub nie
        }                                             // jakiegos exceptiona

        System.out.println("example text after exception");

        // wyjatek typu check, jest wymuszona jego obsluga odrazu jak piszemy kod, to co wywoluje
        // tego rodzaju wyjatki dziedziczy po Exception
        // check exception
        File file = new File("jakas_lokalizacja/plik.txt");
 //       InputStream inputStream = new FileInputStream((file)); // wyrzuci wyjatek bo brak pliku do obsluzenia

        //uncheck exception, dziedzicza po RunTimeExc, one nie wymuszaja obslugi
 //       NullPointerException, ArrayIndexOutOfBoundsException


    }
}
