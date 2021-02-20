import java.util.Scanner;

public class DataValidatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean valid;
        do {
            System.out.println("Pesel: ");
            String pesel = scanner.nextLine();

            System.out.println("Birth year: ");
            int birthYear = scanner.nextInt();
            scanner.nextLine(); // \n

            valid = DataValidator.birthDate(pesel, birthYear);

        } while(!valid);
    }
}