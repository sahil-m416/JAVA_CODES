package Strings;


public class RotationOrNot {
    static boolean isRotation(String orig, String rotd)
    {
        if(orig.length() != rotd.length())
        return false;
        orig = orig + orig;
        return orig.contains(rotd);
    }
    public static void main(String[] args) {
        System.out.println(isRotation("coder", "code"));
    }
}