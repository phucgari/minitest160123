package Material;

import java.time.LocalDate;

public class MaterialManager {
    Material[] materials;
    public MaterialManager(){
        materials=new Material[10];
        materials[0]= new CrispyFlour(5,"1","Sky", LocalDate.of(2022,10,10),100);
        materials[1]= new CrispyFlour(6,"2","Ground",LocalDate.of(2022,9,11),200);
        materials[2]= new CrispyFlour(3,"3","Underground",LocalDate.of(2022,4,12),300);
        materials[3]= new CrispyFlour(4,"4","Nowhere",LocalDate.of(2022,2,13),400);
        materials[4]= new CrispyFlour(7,"5","Somewhere",LocalDate.of(2022,12,12),500);
        materials[5]= new Meat(7,"4","USA",LocalDate.of(2023,1,11),333);
        materials[6]= new Meat(8,"7","German",LocalDate.of(2023,1,15),222);
        materials[7]= new Meat(10,"99","Russia",LocalDate.of(2023,1,10),222);
        materials[8]= new Meat(7,"yes","Japan",LocalDate.of(2022,12,1),555);
        materials[9]= new Meat(1,"22","Kobe",LocalDate.of(2023,1,9),111);
    }
    public void printRealCost(){
        for (Material material:materials){
            System.out.println("Material id "+material.getId()+" have real money after discount is "+material.getRealMoney());
        }
    }
    public void printCostDiff(){
        for (Material material:materials){
            System.out.println("Material name "+material.getName()+" have discounted "+material.getCostDiff());
        }
    }
}

