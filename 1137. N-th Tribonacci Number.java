class Tribonacci_Number {

    public static void main(String[] args) {
      System.out.println("hellow world/n/n/n");
      System.out.println(tribonacci(0));
      System.out.println(tribonacci(4));
      System.out.println(tribonacci(25));
    }
  
    public static int tribonacci(int n) {
      if (n == 0 || n == 1) {
        return n;
      }
      int first = 0;
      int second = 1;
      int third = 1;
      for (int i = 1; i <= n; i++) {
          int fourth = (first + second + third);
          first = second;
          second = third;
          third = fourth;
      }
      return first;
    }
  }
  