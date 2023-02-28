import java.util.Random;

class Data_Generation {
    public static void main( String args[] ) {
      Random rand = new Random(); 
      int skierID_range= 100000;
      int resortID_range= 10;
      int liftID_range= 40;
      int time_range= 360;
      
      int skierID = rand.nextInt(skierID_range); 
      int resortID = rand.nextInt(resortID_range);
      int liftID = rand.nextInt(liftID_range);
      int seasonID = 2022;
      int dayID = 1;
      int time = rand.nextInt(time_range);
      
      System.out.println("Skier Id : " + skierID);
      System.out.println("Resort Id : " + resortID);
      System.out.println("Resort Id : " + liftID);
      System.out.println("Season Id : " + seasonID);
      System.out.println("Day Id : " + dayID);
      System.out.println("Time : " + time);
    }
}