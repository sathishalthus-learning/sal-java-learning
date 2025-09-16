package learning.dev._3_classesObjects;

public class _8_Enums {
    public static void main(String[] args) {
        // 
        System.out.println(DayOfWeek.FRIDAY);

        DayOfWeek someDay = DayOfWeek.FRIDAY;
        System.out.println(someDay);

        System.out.println(DayOfWeek.MONDAY.name());
        System.out.println(DayOfWeek.MONDAY.ordinal());

        DayOfWeek[] days = DayOfWeek.values();
        System.out.println(days);
        
        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");
        System.out.println(monday);

    }

    public enum DayOfWeek{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
