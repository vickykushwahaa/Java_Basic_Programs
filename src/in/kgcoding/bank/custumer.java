package in.kgcoding.bank;


public class custumer {
    public static void main(String[] args) {
        BankAccount acc=new BankAccount("136510108585","Vicky Kushwaha");
        System.out.println(acc.depositeMoney(5000));
        System.out.println(acc.withdrawMoney(6000));
         System.out.println(acc.withdrawMoney(4000));

    }

}
