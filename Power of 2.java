class Solutions {

  public static void main(String[] args) {
    System.out.println("");
    System.out.println(isPower2(3));
    System.out.println(isPower2(1));
    System.out.println(isPower2(0));
    System.out.println(isPower2(16));
  }

  public static boolean isPower2(int n) {
    if (n > 0) {
      if (n == 1) {
        return true;
      }
      while (n % 2 == 0) {
        n = n / 2;
      }
      if (n == 1) {
        return true;
      }
    }
    return false;
  }
}
