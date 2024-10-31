package src.setexcercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        // Create a HashSet with all days of the week
        Set<String> daysOfWeekHashSet = new HashSet<>();
        daysOfWeekHashSet.add("Monday");
        daysOfWeekHashSet.add("Tuesday");
        daysOfWeekHashSet.add("Wednesday");
        daysOfWeekHashSet.add("Thursday");
        daysOfWeekHashSet.add("Friday");
        daysOfWeekHashSet.add("Saturday");
        daysOfWeekHashSet.add("Sunday");

        // Print the content of the HashSet
        System.out.println("HashSet content (unordered): " + daysOfWeekHashSet);

        // Create a LinkedHashSet to preserve the insertion order
        Set<String> daysOfWeekLinkedHashSet = new LinkedHashSet<>();
        daysOfWeekLinkedHashSet.add("Monday");
        daysOfWeekLinkedHashSet.add("Tuesday");
        daysOfWeekLinkedHashSet.add("Wednesday");
        daysOfWeekLinkedHashSet.add("Thursday");
        daysOfWeekLinkedHashSet.add("Friday");
        daysOfWeekLinkedHashSet.add("Saturday");
        daysOfWeekLinkedHashSet.add("Sunday");

        // Print the content of the LinkedHashSet
        System.out.println("LinkedHashSet content (in insertion order): " + daysOfWeekLinkedHashSet);

        // Check if both sets are equal
        boolean areSetsEqual = daysOfWeekHashSet.equals(daysOfWeekLinkedHashSet);
        System.out.println("Is the HashSet equal to the LinkedHashSet? " + areSetsEqual);
    }
}

