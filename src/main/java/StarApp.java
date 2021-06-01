import builder.DateCreator;

public class StarApp {

    public static void main(String[] args) {
        /*
        Account account = new Account(new Statement());

        account.deposit(amountOf(1000), date("10/01/2012"));
        account.deposit(amountOf(2000), date("13/01/2012"));
        account.withdrawal(amountOf(500), date("14/01/2012"));

        account.printStatement(System.out);
         */
        Account account = new Account(new Statement());
        account.deposit(Amount.amountOf(1000), DateCreator.date("10/01/2012"));
        System.out.println(account);

    }
}
