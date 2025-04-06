package OopsChallange;

public class SideItem {

    private String type;
    private double prize;

    public SideItem(String type, double prize) {
        this.type = type;
        this.prize = prize;
    }

    public double getPrize() {
        return prize;
    }


    public String printDetails() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", prize Rs =" + prize +
                '}';
    }
}
