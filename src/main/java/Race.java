public class Race {

    private Car leader;
    private int leaderDistance;

    public void checkLeader(Car car) {
        int distance = 24 * car.speed;
        if (distance > leaderDistance) {
            leaderDistance = distance;
            leader = car;
        }
    }

    public Car getLeader() {
        return leader;
    }

}
