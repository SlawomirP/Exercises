import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DividingTest {

    @Test
    public void shouldReturnPositiveNumber(){
        // given
        Dividing dividing = new Dividing();

        // when
        double result = dividing.divide(4,2);

        // then

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void shouldReturnNegativeNumber(){
        // given
        Dividing dividing = new Dividing();

        // when
        double result = dividing.divide(4,-2);

        // then
        assertThat(result).isEqualTo(-2);
    }



}