import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DivideNewTest {

    @Test
    public void shouldReturnPositiveNumberHere(){
        // given
        DivideNew divideNew = new DivideNew();

        // when
        int result = divideNew.divideMethod(5,1);

        // then
        assertThat(result).isEqualTo(5);
    }


    }

