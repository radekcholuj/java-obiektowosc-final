public final class DataValidator {

    public static boolean birthDate (String pesel, int birthYear){
        int year = Integer.parseInt(pesel.substring(0, 2));
        birthYear = Integer.parseInt(String.valueOf(birthYear).substring(2));
        return year == birthYear;
    }
}
