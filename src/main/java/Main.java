public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        for (int i = 1; i <= 3; i++) {
            int carSpeed;
            String carName = Input.getStringValue(
                    "Введите название машины № " + i + " ",
                    "Введено некорректное значение");

            carSpeed = Input.getIntegerValue(
                    "Введите скорость машины № " + i + " ",
                    "Введено некорректное значение",
                    0,
                    250);
            Car car = new Car(carName, carSpeed);
            race.checkLeader(car);
        }
        System.out.println("Победитель гонки " + race.getLeader().name);
    }
}
