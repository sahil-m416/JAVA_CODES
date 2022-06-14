
/**
 * Enumeration class Day - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Day
{
    MONDAY("MON"), TUESDAY("Tue"), WEDNESDAY("Wed"), THURSDAY("Thu"), FRIDAY("Fri"), SATURDAY("Sat"), SUNDAY("Sun");
    private String value;
    Day(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
