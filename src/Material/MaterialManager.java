package Material;

import java.time.LocalDate;

public class MaterialManager {
    Material[] materials;
    public MaterialManager(){
        materials=new Material[0];
    }
    public void addNewCrispyFlour(double quantity,String id,String name,LocalDate manufacturingDate, int cost){
        Material[] temp= new Material[materials.length+1];
        for (int i = 0; i < materials.length; i++) {
            temp[i]=materials[i];
        }
        temp[materials.length]=new CrispyFlour(quantity,id,name,manufacturingDate,cost);
        this.materials=temp;
    }
    public void addNewMeat(double weight,String id,String name,LocalDate manufacturingDate, int cost){
        Material[] temp=new Material[materials.length+1];
        for (int i = 0; i < materials.length; i++) {
            temp[i]=materials[i];
        }
        temp[materials.length]=new Meat(weight,id,name,manufacturingDate,cost);
        this.materials=temp;
    }
    public void deleteMaterial(int index){
        Material[] temp=new Material[materials.length-1];
        for (int i = 0; i < materials.length; i++) {
            if(i<index){
                temp[i]=materials[i];
            } else if (i>index) {
                temp[i-1]=materials[i];
            }
        }
        this.materials=temp;
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

