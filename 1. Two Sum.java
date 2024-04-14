class Two_Sum {

  public static void main(String[] args) {
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println(two_sum(new int[] { 2, 7, 11, 15 }, 9));
    System.out.println("");
  }

  public static int[] two_sum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] {};
  }
}
