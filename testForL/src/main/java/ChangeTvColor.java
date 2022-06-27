public class ChangeTvColor {

    private TvGeneral telewizor;
    private String nowyKolor;

//    public ChangeTvColor(String nowyKolor) {
//        this.nowyKolor = nowyKolor;
//    }

    public void zmianaKoloru(TvGeneral telewizor, String nowyKolor){

        telewizor.setColor(nowyKolor);
    }
}
