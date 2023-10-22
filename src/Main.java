import java.text.*;
import java.util.*;

public class Main {
  public static Optional<String> decorate(String s, char c) {
    String r;
    if (s == null || s.length() == 0) {
      r = null;
    } else {
      r = c + s + c;
    }
    return Optional.ofNullable(r);
  }
  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト");
    Sword s = new Sword("はがねの剣");

    h1.setSword(s);
    System.out.println("装備：" + h1.getSword().getName());
    System.out.println("clone()で複製します");
    Hero h2 = h1.clone();

    System.out.println("コピー元の勇者の剣の名前を変えます");
    h1.getSword().setName("ひのきの棒");
    System.out.println("コピー元とコピー先の勇者の装備を表示します");
    System.out.println("コピー元：" + h1.getSword().getName() + "／コピー先：" + h2.getSword().getName());

    Pocket<String> p = new Pocket<>();
    p.put("1192");
    String str = p.get();
    System.out.println(str);

    Account account = new Account("1234567", AccountType.FUTSU);
    System.out.println(account.getAccountNo());
    System.out.println(account.getAccountType());

    Optional<String> st = decorate("", '*');
    System.out.println(st.orElse("nullのため処理できません"));

    System.out.print("利用中のJavaバージョン：");
    System.out.println(System.getProperty("java.version"));

    Locale loc = Locale.getDefault();
    System.out.println(loc.getCountry() + "-" + loc.getLanguage());
    String now = (new SimpleDateFormat()).format(new Date());
    if (loc.getLanguage().equals("ja")) {
      System.out.println("現在の時刻は" + now);
    } else {
      System.out.println("Current time is " + now);
    }

    TimeZone tz = TimeZone.getDefault();
    System.out.print("現在のタイムゾーン");
    System.out.println(tz.getDisplayName());
  }
}
