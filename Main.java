// ArrayList Algorithm           A+CR
import java.util.ArrayList;

public class Main
{
   public static void main(String[] arg)
   {
       String[] cityNames = {"Columbo", "Galls", "Jaffna", "Welisara"};
       int[] cityPop = {648034,93118,169102,41306};
       Cities test = new Cities(cityNames, cityPop);
       System.out.println(test);

     test.insertCity("Trincomalee", 108420);
     System.out.println(test);

      test.deleteCity("Galls");
      test.deleteCity("Jaffna");
      System.out.println(test);

      System.out.println(test.visitedCities());

   }
}