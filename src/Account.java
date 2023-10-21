public class Account {
  private String accountNo;

  public Account(String accountNo) {
    this.accountNo = accountNo;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null || !(o instanceof Account)) return false;
    Account r = (Account)o;
    if (!this.accountNo.trim().equals(r.accountNo.trim())) return false;
    return true;
  }
}
