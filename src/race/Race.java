package race;

import features.iUnitGC;

import java.util.Objects;

public abstract class Race  {
    private String name;
    private int gas = 100;
    private int minerals = 100;

    public Race(String name) {
        this.name = name;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getMinerals() {
        return minerals;
    }

    public void setMinerals(int minerals) {
        this.minerals = minerals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race = (Race) o;
        return gas == race.gas && minerals == race.minerals && Objects.equals(name, race.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gas, minerals);
    }

    @Override
    public String toString() {
        return "Race: " + name + ", Gas: " + gas + ", Mineralien: " + minerals;
    }
}
