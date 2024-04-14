class Solution {
    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        if(x >= 0){
            int num = x;
            int revNum = 0;
            while(num > 0){
                int remainder = num % 10;
                revNum = revNum * 10 + remainder;
                num = num / 10;
            }
            if(x == revNum){
                return true;
            }
        }
        return false;
    }
}
