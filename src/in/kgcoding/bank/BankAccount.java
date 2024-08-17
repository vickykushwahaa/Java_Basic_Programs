package in.kgcoding.bank;

 class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(String accountNumber,String accountHolder){
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
    }
    public double depositeMoney(double Money){
        if(Money>=0){
            balance+=Money;
        }else{
            System.out.println("Invalid");
        }
      return balance;
    }
    public double withdrawMoney(double Money) {
        if (balance >= Money) {
            balance-=Money;
            return balance;
        } else if (balance <= 0) {
            System.out.println("Invalid");
        } else {
            balance = Money;
            balance = 0;
        }
        return balance;
    }
}
