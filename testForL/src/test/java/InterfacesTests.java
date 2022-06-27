import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterfacesTests {

    @Test

    public void tests(){
        // zmienna testowanego interfejsu

        TvOn objTvOn;
        TvOff objtvOff;

        // obiekty z klas implementujacych interfejsy
        Samsung samsung = new Samsung("UE12", "black");
        Philips philips = new Philips("PH15", "green");

        objTvOn = samsung;
        objTvOn.tvOn();

        objTvOn = philips;
        objTvOn.tvOn();

        objtvOff = samsung;
        objtvOff.tvOff();

        objtvOff = philips;
        objtvOff.tvOff();

    }

}