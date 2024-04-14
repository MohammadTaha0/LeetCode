class Maximum_Product_of_Two_Elements_in_an_Array {

  public static void main(String[] args) {
    System.out.println(maxProduct(new int[] { 3, 4, 5, 2 }));
    System.out.println(maxProduct(new int[] { 1, 5, 4, 5 }));
    System.out.println(maxProduct(new int[] { 3, 7 }));
  }

  public static int maxProduct(int[] nums) {
    int max = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 1 + i; j < nums.length; j++) {
        int ans = (nums[i] - 1) * (nums[j] - 1);
        if (max < ans) {
          max = ans;
        }
      }
    }
    return max;
  }
}
