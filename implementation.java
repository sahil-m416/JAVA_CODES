public abstract class implementation {
    
    static abstract class Arithmetic{
    
        int x = 10;
        int y = 5;
        abstract void Operation();
    }
    
    static class Addition extends Arithmetic{
    
        void Operation() {
            System.out.println(x + y);
            }
            
}
    static class Subtraction extends Arithmetic{
    
        void Operation() {
            System.out.println(x - y);
      }
  }
    static class Main {
        public static void main(String args[]) {
                Addition sum = new Addition();
                sum.Operation();
                Subtraction diff = new Subtraction();
                diff.Operation();
    }
  }
}
