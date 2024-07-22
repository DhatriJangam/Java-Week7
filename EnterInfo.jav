import java.util.Scanner;

class BlankNameException extends Exception {
    public BlankNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class EnterInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = -1;

        while (true) {
            try {
                System.out.print("Enter your name: ");
                name = scanner.nextLine();
                if (name.isBlank()) {
                    throw new BlankNameException("Name cannot be blank.");
                }

                System.out.print("Enter your age: ");
                String ageInput = scanner.nextLine();
                try {
                    age = Integer.parseInt(ageInput);
                } catch (NumberFormatException e) {
                    throw new Exception("Age must be an integer.");
                }

                if (age <= 0 || age > 120) {
                    throw new InvalidAgeException("Age must be between 1 and 120.");
                }

                System.out.println("Name: " + name + ", Age: " + age);
                break; // Exit loop if all data is valid

            } catch (BlankNameException | InvalidAgeException | Exception e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
