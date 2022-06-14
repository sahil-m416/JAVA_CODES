package Strings;


public class SameSpecies {
    static boolean isSpecies(String dnaStr1, String dnaStr2)
    {
        int i=0;
        int j=0;
        while(i<dnaStr1.length())
        {
            if(dnaStr1.charAt(i) == dnaStr2.charAt(j) )
                j++;
            if(j==dnaStr2.length())
                return true;
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isSpecies("CodeQuotient", "CQti"));
    }
}
