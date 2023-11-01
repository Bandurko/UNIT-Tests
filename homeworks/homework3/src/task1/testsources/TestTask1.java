import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class TestTask1 {
    @ParameterizedTest
    @ValueSource (ints = {2, 8, 26, 88})
    void testEvenOddNumberTrue (int n){
        assertThat(Task1.evenOddNumber(n)).isEqualTo(true);
    }
    @ParameterizedTest
    @ValueSource (ints = {3, 11, 27, 83})
    void testEvenOddNumberFalse (int n){
        assertThat(Task1.evenOddNumber(n)).isEqualTo(false);
    }
}
