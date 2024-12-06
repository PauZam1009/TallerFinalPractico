public class OperacionesUsandoDouble {
    public static void main(String[] args) {

        double a = 58;
        double b = 32;
        double c = 28;

        double suma = a + b;

        double resta = a - b;

        double multiplicacion = a * b;

        double division = 0;
        try {
            division = (a + b) / c;
        } catch (ArithmeticException e) {

            System.out.println("Error: División por cero");
        }

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División (a+b)/c: " + division);
    }
}
