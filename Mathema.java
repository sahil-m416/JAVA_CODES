import java.util.Scanner;
class Mathema
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Length");
        double l = scan.nextDouble();
        System.out.println("enter g");
        double g = scan.nextDouble();
        System.out.println(2*(22/7)*Math.sqrt(l/g));
        scan.close();
    }
}