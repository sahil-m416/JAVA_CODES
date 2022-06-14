class manOverride extends personOverride
{
    public void show()
    {
        super.show();
    }
    public static void main(String args[])
    {
        manOverride m = new manOverride();
        m.show();
    }
}