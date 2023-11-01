import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class TestTask2 {
    @ParameterizedTest
    @ValueSource (ints = {26, 58, 36, 87, 99})
    void testNumberInIntervalTrue (int m){
        assertThat(Task2.numberInInterval(m)).isEqualTo(true);
    }
    @ParameterizedTest
    @ValueSource (ints = {25, -58, 136, 787, 100})
    void testNumberInIntervalFalse (int m){
        assertThat(Task2.numberInInterval(m)).isEqualTo(false);
    }
}
