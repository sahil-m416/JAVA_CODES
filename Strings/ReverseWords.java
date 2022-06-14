package Strings;


class ReverseWorde {
    static void reverse(String s)
    {
        int l,h;
        char ch[] = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i] != ' ')
            {
                l=i;
                while(i<ch.length && ch[i] != ' ')
                i++;
                h= i-1;
                revWord(ch, l, h);
            }
        }
        for(char c : ch)
        System.out.print(c);
    }
    static void revWord(char ch[], int i, int j)
    {
        while(i<j)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        String s = "Sahil Saify";
        System.out.println(s);
        reverse(s);
    }
}