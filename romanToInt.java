import java.util.Scanner;
class romanToInt
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap<>();
        String s = scan.nextLine();
        int fin = 0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        scan.close();
        for(int i=0;i<s.length();i++)
        {
            if(i>0 && (map.get(s.charAt(i)) > map.get(s.charAt(i-1))))
            {
                fin += map.get(s.charAt(i)) - 2* map.get(s.charAt(i-1));
            }
            else{
                fin += map.get(s.charAt(i));
            }
        }
        System.out.println(fin);
    }
}