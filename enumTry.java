class enumTry
{
    public static void main(String args[])
    {
        
        Day day = Day.MONDAY;
        System.out.println("Monday Emum Name :  " + day.name());
        System.out.println("MOnday Enum VAlue : "+day.getValue());
        
        for(Day day1 : Day.values()) {
            System.out.println("Enum Value :" + day1.getValue());
        }
    }
}