
import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {
    public static void main(String[] args) {
        assertThat(Calculator.calculatingDiscount(400, 50)).isEqualTo(200);
        assertThat(Calculator.calculatingDiscount(400, 100)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(400, 0)).isEqualTo(400);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(-400, 50))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(400, -25))
                .isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(400, 150))
                .isInstanceOf(ArithmeticException.class);

    }
}
