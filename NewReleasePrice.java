public class NewReleasePrice extends Price {
   public int getPriceCode() {
       return Movie.NEW_RELEASE;
   }

   class NewReleasePrice ...
   public double getCharge(int daysRented){
      return daysRented * 3;
   } 
}