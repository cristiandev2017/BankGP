import builder.DateCreator;

public class StarApp {
    //Esta clase es la principal esta llamara los demas subclases y/o metodos de las mismas
    public static void main(String[] args) {
        Account account = new Account(new Statement());
        //Se  instancia la clase cuenta y se extrae la info de Amount y de una clase para la fecha DateCreator
        account.deposit(Amount.amountOf(1000), DateCreator.date("10/01/2012"));
        account.deposit(Amount.amountOf(2000), DateCreator.date("13/01/2012"));
        account.withdrawal(Amount.amountOf(500), DateCreator.date("14/01/2012"));

        //Este es una funcion la cual me imprime los elementos como lo pide el ejercicio
        account.printStatement(System.out);

    }
}
