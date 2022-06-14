package Strings;

public class ExpandString {
    static String expString(String str)
    {
        int n  = str.length();
        String fin = "";
        for(int i=0;i<n;i++)
        {
            char c = str.charAt(i);
            String temp = "";
            int count = 1;
            while(i+1<n && str.charAt(i+1) >= '0' && str.charAt(i+1) <='9')
            {
                temp += str.charAt(i+1);
                i++;
            }
            if(temp.length()>0)
            {
                count = Integer.parseInt(temp);
            }
            while(count != 0)
            {
                fin += c;
                count--;
            }
        }
        return  fin;
    }
    public static void main(String[] args) {
        System.out.println( expString("a2b3"));
    }
}
