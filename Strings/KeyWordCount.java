package Strings;

public class KeyWordCount {
    static int count(String str, String word)
    {
        int n = str.length();
        int m = word.length();
        int fin = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                boolean misMatch = false;
                for(int j=0;j<m;j++)
                {
                    if(str.charAt(i) == word.charAt(j))
                    i++;
                    else
                    {
                        misMatch = true;
                        break;
                    }
                }
                if(misMatch == false && (i==n) || str.charAt(i) == ' ')
                {
                    fin++;
                }
                else{
                    while(i<n && str.charAt(i) != ' ')
                    i++;
                }
            }
        }
        return fin;
    }
    public static void main(String[] args) {
        System.out.println(count("abcd abc Xys", "abc"));
    }
}