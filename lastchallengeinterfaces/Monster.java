package lastchallengeinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(this.name);
        values.add(Integer.toString(this.hitPoints));
        values.add(Integer.toString(this.strength));
        return values;
    }

    @Override
    public void read(List<String> data) {
        if (data != null && data.size() > 0) {
            this.name = data.get(0);
            this.hitPoints = Integer.parseInt(data.get(1));
            this.strength = Integer.parseInt(data.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints +
                ", strength=" + strength + "}";
    }
}
