public class Account {
  private String accountNo;
  private int zandaka;
  private AccountType accountType;

  public Account(String accountNo, AccountType aType) {
    this.accountNo = accountNo;
    this.accountType = aType;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null || !(o instanceof Account)) return false;
    Account r = (Account)o;
    if (!this.accountNo.trim().equals(r.accountNo.trim())) return false;
    return true;
  }

  public String getAccountNo() {
    return this.accountNo;
  }

  public AccountType getAccountType() {
    return this.accountType;
  }
}
