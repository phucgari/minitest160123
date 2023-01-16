package Material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrispyFlour extends Material{
    double quantity;
    CrispyFlour(){}
    CrispyFlour(double quantity,String id,String name,LocalDate manufacturingDate, int cost){
        super(id,name,manufacturingDate,cost);
        this.quantity=quantity;
    }
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
        double discountRate=0;
        int monthsToExpire=(int) ChronoUnit.MONTHS.between( LocalDate.now() , getExpiryDate() );
        if(monthsToExpire<=2){
            discountRate=0.4;
        }else if(monthsToExpire<=4) {
            discountRate=0.2;
        }else {discountRate=0.05;}
        return (1-discountRate)*super.cost;
    }

    @Override
    public double getCostDiff() {
        return super.cost-getRealMoney();
    }
}
