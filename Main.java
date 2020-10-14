public class Main {
  public static void main(String[] args){
    Customer c = new Customer("Jorgin");
    Movie m = new Movie("Silencio dos Inocentes", 0);
    Rental r = new Rental(m, 365);
    c.addRental(r);
    
    System.out.printf("Nome do Customer = %s \n",c.getName());
    System.out.printf("Statement Customer = %s \n",c.statement());
    System.out.printf("HtmlStatement Customer = %s \n",c.htmlStatement());
  }
}