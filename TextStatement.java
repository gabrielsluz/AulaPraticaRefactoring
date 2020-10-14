import java.util.Enumeration;

public class TextStatement extends Statement {

    public String rentalRecord(Customer aCustomer){
        String result = "Rental Record for " + aCustomer.getName() +
      "\n";
      return result;
    }

    public String rentalFigures(Rental each){
        String result = "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
         return result;
    }

    public String rentalFooter(Customer aCustomer){
       String result = "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
      result += "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
      return result;
    }

    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = this.rentalRecord(aCustomer);

      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += this.rentalFigures(each);
      }
      //add footer lines
      result += this.rentalFooter(aCustomer);
      return result;
   }

}