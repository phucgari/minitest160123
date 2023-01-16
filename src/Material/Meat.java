package Material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meat extends Material implements Discount{
    double weight;

    @Override
    double getAmount() {
        return super.cost*weight;
    }

    @Override
    LocalDate getExpiryDate() {
        return super.manufacturingDate.plusDays(7);
    }

    @Override
    public double getRealMoney() {
        double discountRate=0;
        int daysToExpire=(int) ChronoUnit.DAYS.between( LocalDate.now() , getExpiryDate() );
        if(daysToExpire<=5){
            discountRate=0.3;
        }else {discountRate=0.1;}
        return discountRate*super.cost;
    }

}
