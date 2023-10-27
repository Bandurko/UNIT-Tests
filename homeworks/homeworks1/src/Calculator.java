public class Calculator {

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки

        if (purchaseAmount <= 0) {
            throw new ArithmeticException("Указанная цена меньше либо равна 0");
        }
        if (discountAmount < 0) {
            throw new ArithmeticException("Скидка меньше 0%");
        }
        if (discountAmount > 100) {
            throw new ArithmeticException("Скидка больше 100%");
        }
        return purchaseAmount - (purchaseAmount * discountAmount / 100);
    }
}