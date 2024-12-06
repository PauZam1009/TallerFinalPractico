public class SumandoNumerosPares {
    public static void main(String[] args) {

        int suma = sumarPares();
        System.out.println("La suma de los números pares entre 1 y 100 es: " + suma);
    }

    public static int sumarPares() {
        int suma = 0;

        for (int i = 2; i <= 100; i += 2) {
            suma += i;
        }

        return suma;
    }
}
