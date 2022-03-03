package features;

public class UnitGC {
    public static int hit(iUnitGC g){
        if(g.getShields() != 0){
           return g.getHitPoints() - g.getShields();
        }else if(g.getHull() !=0 && g.getShields() == 0){
            return g.getHull() - g.getHitPoints();
        }

    }
}
