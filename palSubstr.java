

class palSubstr {
    public String longestPalindrome(String s) {
        
        
        for(int i=0;i<s.length()-1;i++)
        {
            boolean ans = isPalindrome(s.substring(i));
                if(ans == true)
                {
                    return s.substring(i);
                }
        }
        return "";
        
    }
    
    public boolean isPalindrome(String s)
    {
        boolean ans = false;
        String rev = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        
        if(rev.equals(s))
        {
            ans = true;
        }
        
        return ans;
    }
}