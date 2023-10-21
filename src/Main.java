import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Hero a = new Hero("Takeshi", 100, 100);
    System.out.println(a);

    Account ac1 = new Account("1234567");
    Account ac2 = new Account("1234567");
    System.out.println(ac1.equals(ac2));

    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {1, 2, 3, 4, 5};
    System.out.println("誤った判定：" + arr1.equals(arr2));
    System.out.println("正しい判定：" + Arrays.equals(arr1, arr2));
  }
}
