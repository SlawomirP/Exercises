public class Main {
    public static void main(String[] args) {
        TvGeneral tv = new Samsung("UE42", "black");

        TvGeneral tv2 = new Philips("PH14", "yellow");

        System.out.println(tv);
        System.out.println(tv2);

        ChangeTvColor zmieniaczKoloru = new ChangeTvColor();

        zmieniaczKoloru.zmianaKoloru(tv,"green");
        System.out.println(tv);

        zmieniaczKoloru.zmianaKoloru(tv2, "blue");
        System.out.println(tv2);



    }
}
