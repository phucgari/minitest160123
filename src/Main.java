import Material.MaterialManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MaterialManager manager=new MaterialManager();
        manager.printRealCost();
        manager.printCostDiff();
    }
}