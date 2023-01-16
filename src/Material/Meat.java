package Material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meat extends Material{
    double weight;
    Meat(){}
    Meat(double weight,String id,String name,LocalDate manufacturingDate, int cost){
        super(id,name,manufacturingDate,cost);
        this.weight=weight;
    }
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
        return (1-discountRate)*super.cost;
    }

    @Override
    public double getCostDiff() {
        return super.cost-getRealMoney();
    }

}
