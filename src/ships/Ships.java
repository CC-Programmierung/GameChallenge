package ships;

import features.iUnitGC;

import java.util.Objects;

public abstract class Ships implements iUnitGC {
    private String name;
    private int shields;
    private int hull;
    private int hitPoints;
    private int buildCosts;

    public Ships(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShields() {
        return shields;
    }

    public void setShields(int shields) {
        this.shields = shields;
    }

    public int getHull() {
        return hull;
    }

    public void setHull(int hull) {
        this.hull = hull;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getBuildCosts() {
        return buildCosts;
    }

    public void setBuildCosts(int buildCosts) {
        this.buildCosts = buildCosts;
    }

    public void hit(int hitPoints){
        if(hitPoints == hitPoints){
            shields = shields - hitPoints;
        }
    }

    public void loadShields(int shields){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ships ships = (Ships) o;
        return shields == ships.shields && hull == ships.hull && hitPoints == ships.hitPoints && buildCosts == ships.buildCosts && Objects.equals(name, ships.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shields, hull, hitPoints, buildCosts);
    }

    @Override
    public String toString() {
        return "Ships{" +
                "name='" + name + '\'' +
                ", shields=" + shields +
                ", hull=" + hull +
                ", hitPoints=" + hitPoints +
                ", buildCosts=" + buildCosts +
                '}';
    }
}
