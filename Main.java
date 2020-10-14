public class Main {
  public static void main(String[] args){
    Customer c = new Customer("Jorgin");
    Movie m = new Movie("Silencio dos Inocentes", 12);
    Rental r = new Rental(m, 365);
    
    System.out.println(c.getName());
  }
}