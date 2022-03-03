package debug;

import features.UnitGC;
import race.Protoss;
import ships.ShipProtoss;
import ships.Ships;

public class Main {

    public static void main(String[] args) {
        Protoss protoss = new Protoss("Protoss");
        ShipProtoss sp  = new ShipProtoss("test");


        protoss.getMinerals();
        protoss.getGas();
        //System.out.println(protoss);
        System.out.println();
        protoss.addShips("crosiar");
        protoss.addShips("carrier");
        protoss.addShips("scout");
        protoss.addShips("probe");
        protoss.addShips("shuttle");

        protoss.removeShip((ShipProtoss) protoss.carrierShip());
        sp.hit(10);
        System.out.println(sp);





        protoss.getFleet();

        //System.out.println(UnitGC.hit(test));








    }
}
