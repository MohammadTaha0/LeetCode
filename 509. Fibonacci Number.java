class Fibonacci_Number {

  public static void main(String[] args) {
    System.out.println("hellow world/n/n/n");
    System.out.println(fib(10));
    System.out.println(fib(3));
  }

  public static int fib(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int first = 0;
    int second = 1;
    for (int i = 1; i <= n; i++) {
        int third = first + second;
        first = second;
        second = third;
    }
    return first;
  }
}
