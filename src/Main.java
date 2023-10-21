public class Main {
  public static void main(String[] args) throws Exception {
    Hero a = new Hero("Takeshi", 100, 100);
    System.out.println(a);

    Account ac1 = new Account("1234567");
    Account ac2 = new Account("1234567");
    System.out.println(ac1.equals(ac2));
  }
}
