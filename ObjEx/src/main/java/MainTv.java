import java.util.Scanner;

public class MainTv {
    public static void main(String[] args) {

//        tvOperating();
        pilotOperating();

    }

    // obsługa
    private static void tvOperating (){
        Scanner scanner = new Scanner(System.in);
        // stworzymy obiekt na ktorym bedziemy wykonywac opcje, wywolywac metody, tu zmieniamy modele
//        UE43RU7172 tv = new UE43RU7172("123");
//        P43PU6523 tv = new P43PU6523("321");
        TV tv = new P43PU6523("321"); // dokonujemy zmiane i wskazujemy na nazwe interfejsu
        // teraz zmieniamy tylko modele a interfejs zostaje i znowu polimorf
        // zrobimy na switchu, tak ze beda wczytywane dane od uzytkownika

        int option = 0;
        System.out.println("Choose option:");
        System.out.println("1. On; 2. Off; 3. Change program; 4. END");

        while(option != 4){
            option = scanner.nextInt();

            switch (option) {
                case 1 -> tv.onTv();
                case 2 -> tv.offTv();
                case 3 -> {
                    System.out.println("Write program number...");
                    int progNumber = scanner.nextInt();
                    tv.changeProg(progNumber);
                    break;
                }
            }
        }
        scanner.close();
    }

    private static void pilotOperating(){ // metoda oblusgi pilota
        Scanner scanner = new Scanner(System.in);
        PilotTv pilot = new Pilot(); // obiekt pilota
        TV tv = new P43PU6523("123");// obiekt tv ktory podamy jako obiekt wykorzystywany przez pilot
        pilot.pairing(tv); // metoda przypisujaca dany tv do pola ktore oblsuguje pilot

        // teraz petla dzialajaca pod warunkiem while i w srodku switch aby wybierac
        int option = 0;
        System.out.println("Choose option:");
        System.out.println("0. On/Off; 1. prog 1; 2. prog 2; 3. prog 3");

        while(option != 4){
            option = scanner.nextInt();

            switch (option) {
                case 0 -> pilot.redButton();
                case 1 -> pilot.button1();
                case 2 -> pilot.button2();
                case 3 -> pilot.button3();

            }
        }
        scanner.close();
    }
}
