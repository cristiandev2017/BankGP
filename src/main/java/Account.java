import java.util.Date;

public class Account {

    private final Statement statement;

    private Amount balance = Amount.amountOf(0);

    public Account(Statement statement) {
        this.statement = statement;
    }

    public void deposit(Amount value, Date date ) {
        recordTransaction(value.negative(value),date);
    }

    public void withdraw(int amount){

    }

    private void recordTransaction(Amount value, Date date) {
        Transaction transaction = new Transaction(value, date);
        Amount balanceAfterTransaction = transaction.balanceAfterTransaction(balance);
        balance = balanceAfterTransaction;
        statement.addLineContaining(transaction, balanceAfterTransaction);
    }

    public void printStatements() {

    }



}
