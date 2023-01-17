import Material.MaterialManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MaterialManager manager=new MaterialManager();
        manager.addNewCrispyFlour(5,"1","Sky", LocalDate.of(2022,10,10),100);
        manager.addNewCrispyFlour(6,"2","Ground", LocalDate.of(2022,9,11),200);
        manager.addNewCrispyFlour(3,"3","Underground",LocalDate.of(2022,4,12),300);
        manager.addNewCrispyFlour(4,"4","Nowhere",LocalDate.of(2022,2,13),400);
        manager.addNewCrispyFlour(7,"5","Somewhere",LocalDate.of(2022,12,12),500);
        manager.addNewMeat(7,"behind","USA",LocalDate.of(2023,1,11),333);
        manager.addNewMeat(8,"hello","German",LocalDate.of(2023,1,15),222);
        manager.addNewMeat(10,"no","Russia",LocalDate.of(2023,1,10),222);
        manager.addNewMeat(7,"yes","Japan",LocalDate.of(2022,12,1),555);
        manager.addNewMeat(1,"great","Kobe",LocalDate.of(2023,1,9),111);
        manager.deleteMaterial(0);
        manager.printRealCost();
        manager.printCostDiff();
    }
}