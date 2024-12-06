import java.util.Scanner;

public class TipoDeCuenta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese un número para identificar el tipo de cuenta:");
        System.out.println("1 para Cuenta Corriente");
        System.out.println("2 para Cuenta de Ahorro");
        System.out.println("3 para Cuenta Nómina");


        int numeroCuenta = scanner.nextInt();


        switch (numeroCuenta) {
            case 1:
                System.out.println("Tipo de cuenta: Cuenta Corriente");
                break;
            case 2:
                System.out.println("Tipo de cuenta: Cuenta de Ahorro");
                break;
            case 3:
                System.out.println("Tipo de cuenta: Cuenta Nómina");
                break;
            default:
                System.out.println("Número inválido. Por favor, ingrese 1, 2 o 3.");
                break;
        }

        scanner.close();
    }
}
