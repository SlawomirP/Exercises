public class ExWithSuper extends Exception{

    public ExWithSuper() {  // wywołamy nadrzędny konstruktos czyli uzyjemy super
        super ("Test message, super");
    }

    // mozna tez w konstruktorze w argumencie dac Sting message i potem to message dac po super ale wtedy bedzie trzeb
    // samemu cos wpisac przy wywolaniu wyjatku
}
