import java.util.Scanner;

public class aliensAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String launchTimeString = scan.nextLine();
        String travelTimeString = scan.nextLine();

        String launchTime[] = launchTimeString.split(" ");
        String travelTime[] = travelTimeString.split(" ");

        int hours = Integer.parseInt(launchTime[0]) + Integer.parseInt(travelTime[0]);
        int minutes = Integer.parseInt(launchTime[1]) + Integer.parseInt(travelTime[1]);
        if (minutes >= 60) {
            minutes = minutes % 60;
            hours++;
        }
        if (hours >= 24)
            hours = hours % 24;
        String finHour = String.format("%02d", hours);
        String finMinute = String.format("%02d", minutes);
        System.out.println(finHour + " " + finMinute);

        scan.close();
    }
}
