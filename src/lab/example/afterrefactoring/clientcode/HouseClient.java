package example.afterrefactoring.clientcode;

import example.afterrefactoring.ConcreteHouse;
import example.afterrefactoring.GlassHouse;
import example.afterrefactoring.HouseTemplate;
import example.afterrefactoring.WoodenHouse;

public class HouseClient {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();

        System.out.println("************");

        houseType = new ConcreteHouse();
        houseType.buildHouse();
    }
}
