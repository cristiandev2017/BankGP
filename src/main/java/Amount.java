import java.text.DecimalFormat;

public class Amount {

    //La clase DecimalFormat es una clase de Java que me permite definir el formato de los decimales en este caso sera hasta 2 decimales
    private DecimalFormat decimalFormat = new DecimalFormat("#.00");
    //Se define una variable privada llamada value esta me permitira obtener los valores de los montos y demás
    private int value;
    //Se define un constructor con solo el value
    public Amount(int value) {
        this.value = value;
    }
    //Ahora creamos una funcion de tipo Amount a esto se le llama encapsulamiento de clases y me sirve pa
    public static Amount amountOf(int value) {
        return new Amount(value);
    }
    //Esta funcion hara la operacion de sumar tomara el valor que viene y lo sumara con el que contiene la clase
    public Amount plus(Amount otherAmount) {
        return amountOf(this.value + otherAmount.value);
    }
    //Esta funcion hara la operacion de definir si es mayor que.
    public boolean isGreaterThan(Amount otherAmount) {
        return this.value > otherAmount.value;
    }
    //Esta funcion lo que hara es convertir el valor a termino absoluto es decir siempre mostrara valores positivos
    public Amount absoluteValue() {
        return amountOf(Math.abs(value));
    }

    //Este le da formato al valor que recibe
    public String moneyRepresentation() {
        return decimalFormat.format(value);
    }
    //Este resta el valor que se obtiene
    public Amount negative() {
        return amountOf(-value);
    }

    //Se sobrescribe el objeto equals con la finalidad de poder usar sus propiedades en este caso validando los valores
    @Override
    public boolean equals(Object obj) {
        Amount other = (Amount) obj;
        if (value != other.value)
            return false;
        return true;
    }

}

