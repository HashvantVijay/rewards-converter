import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    public void create_with_cash_value() throws ValueError {
        double cashValue = 100;
        RewardValue rewardValue = null;
        try {
            rewardValue = new RewardValue(cashValue);
        } catch (ValueError e) {
            throw new RuntimeException(e);
        }
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() throws ValueError {
        int milesValue = 10000;
        RewardValue rewardValue = null;
        try {
            rewardValue = new RewardValue(milesValue);
        } catch (ValueError e) {
            throw new RuntimeException(e);
        }
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() throws AssertionError {
        if (true) {
            throw new AssertionError();
        }
    }

    @Test
    void convert_from_miles_to_cash() throws AssertionError {
        if (true) {
            throw new AssertionError();
        }
    }
}
