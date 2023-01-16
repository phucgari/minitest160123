package Material;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
    double quantity;

    @Override
    double getAmount() {
        return quantity*super.cost;
    }

    @Override
    LocalDate getExpiryDate() {
        return super.manufacturingDate.plusYears(1);
    }

    @Override
    public double getRealMoney() {
        return 0;
    }
}
