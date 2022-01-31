import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class RevWordByWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        int countPeriod=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '.')
            {
                countPeriod++;
            }
        }
        String fin[] = new String[countPeriod+1];
        StringBuilder str = new StringBuilder("");
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != '.')
            {
                str = str.append(s.charAt(i));
            }
            else 
            {
                fin[j] = str.toString();
                str = new StringBuilder("");
                j++;
            }
        }
        StringBuilder lastWord = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) == '.') break;
            lastWord.append(s.charAt(i));
        }
        lastWord.reverse();
        fin[countPeriod] = lastWord.toString();
        Collections.reverse(Arrays.asList(fin));
        System.out.println(Arrays.asList(fin));
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<fin.length;i++)
        {
            for(int k=0;k <fin[i].length();k++)
            {
                ans.append(fin[i].charAt(k));
            }
            ans.append(".");
        }
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans);
    }
}
