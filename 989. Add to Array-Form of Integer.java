import java.util.ArrayList;
import java.util.List;

class Add_to_ArrayForm_of_Integer {

  public static void main(String[] args) {
    System.out.println("expected ans: " + (1200+34));
    System.out.println(addToArrayForm(new int[] { 1,2, 0, 0 }, 34));
     System.out.println("expected ans: " + (274+181));
    System.out.println(addToArrayForm(new int[] { 2,7, 4 }, 181));
     System.out.println("expected ans: " + (274+18111));
    System.out.println(addToArrayForm(new int[] { 2,7, 4 }, 18111));
     System.out.println("expected ans: " + (7+993));
    System.out.println(addToArrayForm(new int[] {7}, 993));
    System.out.println("");
  }

  public static List<Integer> addToArrayForm(int[] num, int k) {
    List<Integer> ans = new ArrayList<>();
    int pointer = num.length - 1;
    int carry = 0;
    int sum = 0;
    while (pointer >= 0 || k > 0) {
      int lastDigit = k % 10;
      k = k / 10;
      if(pointer >= 0){
          sum = num[pointer] + lastDigit + carry;
      }else{
          sum = lastDigit + carry;
      }
      carry = 0;
      if(sum > 9){
          carry = sum/10;
          sum = sum % 10;
      }
      ans.add(0,sum);
      pointer--;
    }
    if(carry > 0){
        ans.add(0,carry);
    }
    return ans;
  }
}
