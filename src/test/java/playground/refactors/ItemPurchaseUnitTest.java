package playground.refactors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class ItemPurchaseUnitTest {
    @ParameterizedTest
    @CsvSource({
        "98,100,1",
        "490,250,2",
        "294,100,3",
        "980,250,4",
        "490,100,5",
        "1425,250,6",
        "686,100,7",
        "1900,250,8",
    })
    void totalPrice(double expectedTotal, double itemPrice, int quantity) {
        final ItemPurchase itemPurchase = new ItemPurchase(itemPrice, quantity);
        assertThat(itemPurchase.totalPriceA())
            .isEqualTo(itemPurchase.totalPriceB())
            .isEqualTo(expectedTotal);
    }
}