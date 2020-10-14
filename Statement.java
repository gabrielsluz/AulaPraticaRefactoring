import java.util.Enumeration;
public abstract class Statement {

    abstract String rentalRecord(Customer aCustomer);
    abstract String rentalFigures(Rental each);
    abstract String rentalFooter(Customer aCustomer);

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