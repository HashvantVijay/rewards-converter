public class RewardValue {

        public static final double CONVERSION_RATE = 0.0035;  // Conversion rate from miles to cash

        private double cashValue;
        private double milesValue;

        public void RewardValue(double cashValue) throws ValueError {

            if (cashValue < 0) {
                throw new ValueError("Cash value cannot be negative.");
            }
            this.cashValue = cashValue;
            this.milesValue = cashValue / CONVERSION_RATE;
        }

        public RewardValue(double milesValue) throws ValueError {

            if (milesValue < 0) {
                throw new ValueError("Miles value cannot be negative.");
            }
            this.milesValue = milesValue;
            this.cashValue = milesValue * CONVERSION_RATE;
        }

        public double getCashValue() {

            return cashValue;
        }

        public double getMilesValue() {

            return milesValue;
        }
    }

