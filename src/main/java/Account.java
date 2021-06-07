import java.util.Date;

import java.io.PrintStream;
import java.util.Date;

public class Account {
    //Se declara una variable tipo  Statement para verificar el estado
    private Statement statement;
    //El balance vendra como una variable utilizando la funcionalidad de amountOf
    private Amount balance = Amount.amountOf(0);
    //Se define el constructor con el Statement
    public Account(Statement statement) {
        this.statement = statement;
    }
    //Deposit es la operacion que me permitira depositar a la cuenta con el valor y la fecha
    public void deposit(Amount value, Date date) {
        recordTransaction(value, date);
    }

    public void withdrawal(Amount value, Date date) {
        recordTransaction(value.negative(), date);
    }
    //Imprime el estado con lo que mandaremos al main
    public void printStatement(PrintStream printer) {
        statement.printTo(printer);
    }
    //Este es el que generara el registro de las transacciones
    private void recordTransaction(Amount value, Date date) {
        Transaction transaction = new Transaction(value, date);
        Amount balanceAfterTransaction = transaction.balanceAfterTransaction(balance);
        balance = balanceAfterTransaction;
        statement.addLineContaining(transaction, balanceAfterTransaction);
    }

}

