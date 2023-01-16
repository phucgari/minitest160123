package Material;

import java.time.LocalDate;

public abstract class Material {
    String id="";
    String name="";
    LocalDate manufacturingDate;
    int cost;
    Material(){}
    Material(String i,String n,LocalDate m, int c){
        id=i;
        name=n;
        manufacturingDate=m;
        cost=c;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
    abstract double getAmount();
    abstract LocalDate getExpiryDate();
}

