import java.io.FileNotFoundException;

public class MainDoThrows {
    public static void main(String[] args) {

//       UserForExc user = new UserForExc();
//        try {
//            user.enterEmail("slaw");
//            user.logIn("qwerty"); // musimy obsluzyc bo pokazuje exception
//        } catch (MyException e) {
//            System.out.println("change password");
//        } catch (MyExcRuntime ex){
//            System.out.println("error z runtime");
//        }
//
//        System.out.println("text after block");

        try {
            justThrowException();
        } catch (ExWithSuper e) {
          //  throw new RuntimeException(e); // zamiast tego mozna dac
            System.out.println("message from exception: " + e.getMessage());
        }
    }

    public static void justThrowException () throws ExWithSuper {
        throw new ExWithSuper();
    }
}
