package race;

import ships.ShipProtoss;
import java.util.ArrayList;


public class Protoss extends Race  {
    private ArrayList<ShipProtoss> units;


    public Protoss(String name) {
        super(name);
        this.units = new ArrayList<>();
    }

    public void getFleet(){
        for(Object fleet : units){
            System.out.println(fleet);
        }
    }



    public void addShips(String flag){
        if(flag == "crosiar"){
            corsiarShip();
            units.add((ShipProtoss) corsiarShip());
        }else if(flag == "carrier"){
            carrierShip();
            units.add((ShipProtoss) carrierShip());
        }else if(flag == "probe"){
            probeShip();
            //units.add((ShipProtoss) probeShip());
        }else if(flag == "scout"){
            scoutShip();
            units.add((ShipProtoss) scoutShip());
        }else if(flag == "shuttle"){
            shuttleShip();
            units.add((ShipProtoss) shuttleShip());
        }
    }

    //geht nicht richtig
    public void createNewShip(ShipProtoss sp){
        units.add(new ShipProtoss("test"));

    }

    public void removeShip(ShipProtoss sp){
        units.remove(sp);
    }

    public Object probeShip(){
        ShipProtoss probe = new ShipProtoss("Probe");
        probe.setHull(50);
        probe.setShields(5);
        probe.setHitPoints(5);
        units.add(probe);

        return probe;
    }

    public Object scoutShip(){
        ShipProtoss scout = new ShipProtoss("Scout");
        scout.setHull(800);
        scout.setShields(200);
        scout.setHitPoints(50);

        return scout;
    }

    public Object shuttleShip(){
        ShipProtoss shuttle = new ShipProtoss("Shuttle");
        shuttle.setHull(400);
        shuttle.setShields(60);
        shuttle.setHitPoints(25);

        return shuttle;
    }

    public Object corsiarShip(){
        ShipProtoss crosiar = new ShipProtoss("Crosiar");
        crosiar.setHull(150);
        crosiar.setShields(20);
        crosiar.setHitPoints(10);

        return  crosiar;
    }

    public Object carrierShip(){
        ShipProtoss carrier = new ShipProtoss("Carrier");
        carrier.setHull(1500);
        carrier.setShields(250);
        carrier.setHitPoints(1000);

        return carrier;
    }
}
