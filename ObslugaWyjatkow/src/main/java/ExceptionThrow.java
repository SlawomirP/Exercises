import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionThrow {

    // za nawiasami okraglymi dajemy throws i ten wyjatek ktory nam wyrzuca.
    // to spowoduje ze tam gdzie wywolamy ta metode to bedzie trzeba obluzyc wyjatek
    public void testMethod() throws FileNotFoundException{

        File file = new File("txt.txt");
        InputStream inputStream = new FileInputStream(file);

//        try {
//            File file = new File("txt.txt");
//            InputStream inputStream = new FileInputStream(file); // da wyjatek check
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
