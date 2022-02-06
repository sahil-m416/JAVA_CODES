// in java if we have a string variable and any constant which is initialised 
// more than one time memory allocation will be only for single one 
// to prove we have function called hashcode


// whenever we have multiple instance of a variable in a String class
// then the fuction is hashcode and the memory occupied is only once, whereas in other classes
// multiple instances of multiple variable will have different spaces.
class A
{

	String x = new String("sahil");
	String y = new String("sahil");
	String a = new String("sahil");
	String b = new String("sahil");

	System.out.println(x.hashCode());
	System.out.println(y.hashCode());
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());

  int x;
  public A(int q)
  {
    x=q;
  }
  public void displayx()
  {
    System.out.println(x)
  }
}

class B extends A 
{
  int y;
  public B(int p)
  {
    
    super(p/2);

    //Whenever we want to pass values from derived class to base class
    // we use the keyword "SUper"

    // Super should be used in the first line of function not in the second line

   
    y=p;
  }
   public void display()
  {
    System.out.println(x)
  }
}


public class hashcode

{
  public static void main(String[] args) {
    B obj = new B(100);
    obj.display();

    obj.displayx();
  }
}