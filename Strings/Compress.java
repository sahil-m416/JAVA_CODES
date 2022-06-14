package Strings;



public class Compress {
    static String compress(String s)
    {
        
        StringBuilder string = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            int count = 1;
            string.append(Character.toString(s.charAt(i)));
            while(i+1<s.length() && s.charAt(i) == s.charAt(i+1))
            {
                count++;
                i++;
            }
            if(count>1)
            {
                string.append(count);
            }
        }
        return string.toString();
    }
    public static void main(String[] args) {
        System.out.println(compress("aabbbcd"));
    }
}