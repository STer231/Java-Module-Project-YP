public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        for (int i = 1; i <= 3; i++) {
            String carName = "";
            int carSpeed = 0;

            Input inputName = new Input();
            Input inputSpeed = new Input();
            carName = inputName.getStringValue(
                    "Введите название машины № " + i + " ",
                    "Введено некорректное значение");

            carSpeed = inputSpeed.getIntegerValue(
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
