import java.io.PrintStream;

public class StatementLine {

    private Transaction transaction;
    private Amount currentBalance;

    public StatementLine(Transaction transaction, Amount currentBalance) {
        this.transaction = transaction;
        this.currentBalance = currentBalance;
    }
    //Imprimirá el estado de la transaccion y el balance actual
    public void printTo(PrintStream printer) {
        this.transaction.printTo(printer, currentBalance);
    }

}
