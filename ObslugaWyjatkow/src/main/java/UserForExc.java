public class UserForExc {

    public void logIn(String password) throws MyException{
        if (!password.contains("as")){
            throw new MyException();  // trzeba to obsłużyć, wyrzucamy throws
        }
    }

    public void enterEmail(String email){
        if (!email.contains("@")){
            throw new MyExcRuntime();
        }
    }
}
