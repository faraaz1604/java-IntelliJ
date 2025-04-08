package lastchallengeinterfaces;

public class points {

    private int points;
    private int TotalPoints;

    public points(int points, int totalPoints) {
        this.points = points;
        TotalPoints = totalPoints;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getTotalPoints() {
        return TotalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        TotalPoints = totalPoints;
    }
}
