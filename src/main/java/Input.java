import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getStringValue(String message, String errorMessage) {
        while (true) {
            System.out.println(message);
            if (!scanner.hasNext("[A-Za-z]+") && !scanner.hasNext("[А-Яа-я]+")) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                return scanner.next();
            }
        }
    }

    public static int getIntegerValue(String message, String errorMessage, int downLimit, int upperLimit) {
        while (true) {
            System.out.println(message);
            if (scanner.hasNextInt()) {
                int result = scanner.nextInt();
                if (result > downLimit && result <= upperLimit)
                    return result;
                System.out.println(errorMessage);
            } else {
                System.out.println(errorMessage);
                scanner.next();
            }
        }
    }
}
