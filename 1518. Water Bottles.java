class Water_Bottles {

    public static void main(String[] args) {
      System.out.println("hellow world/n/n/n");
      System.out.println(water_bottles(9, 3));
      System.out.println(water_bottles(15, 4));
    }
  
    public static int water_bottles(int numBottles,int numExchange) {
      int fill = numBottles;
      int max = 0;

      while(fill >= numExchange){
        fill -= numExchange;
        max++;
        fill++;
      }

      return max + numBottles;
    }
  }
  