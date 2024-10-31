package src.enumexercise;

public class EnumExercise {
    public static void main(String[] args) {
        // Iterate through all values of the Month enumeration
        for (Month month : Month.values()) {
            // Check if the month name ends with 'Y'
            if (month.name().endsWith("Y")) {
                System.out.println(month + " ends with y");
            } else {
                System.out.println(month + " doesn't end with y");
            }
        }
    }
}