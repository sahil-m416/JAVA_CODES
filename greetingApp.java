import java.util.Scanner;
class greetingApp
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name " );
        String name = scan.nextLine();
        printName p = new printName();
        p.greet(name);
        scan.close();
    }
}