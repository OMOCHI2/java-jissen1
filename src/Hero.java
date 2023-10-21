import java.util.*;

public class Hero {
  private String name;
  private int hp, mp;

  public Hero(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  public String toString() {
    return "勇者(名前=" + this.name + "/HP="
        + this.hp + "/MP=" + this.mp + ")";
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null || !(o instanceof Hero)) return false;
    Hero h = (Hero)o;
    if (!this.name.trim().equals(h.name.trim())) return false;
    return true;
  }

  public int hashCode() {
    return Objects.hash(this.name, this.hp, this.mp);
  }
}
