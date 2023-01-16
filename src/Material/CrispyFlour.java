package Material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrispyFlour extends Material{
    private double quantity;
    CrispyFlour(){}
    CrispyFlour(double quantity,String id,String name,LocalDate manufacturingDate, int cost){
        super(id,name,manufacturingDate,cost);
        this.quantity=quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    double getAmount() {
        return quantity*super.getCost();
    }

    @Override
    LocalDate getExpiryDate() {
        return super.getManufacturingDate().plusYears(1);
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
        return (1-discountRate)*getAmount();
    }

    @Override
    public double getCostDiff() {
        return getAmount()-getRealMoney();
    }
}
