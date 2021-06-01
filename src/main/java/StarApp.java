import builder.DateCreator;

public class StarApp {

    public static void main(String[] args) {
        Account account = new Account(new Statement());

        account.deposit(Amount.amountOf(1000), DateCreator.date("10/01/2012"));
        account.deposit(Amount.amountOf(2000), DateCreator.date("13/01/2012"));
        account.withdrawal(Amount.amountOf(500), DateCreator.date("14/01/2012"));

        account.printStatement(System.out);

    }
}
