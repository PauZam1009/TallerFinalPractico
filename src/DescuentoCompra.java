import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el total de su compra:");
        double totalCompra = scanner.nextDouble();

        double descuento = 0;

        if (totalCompra >= 100000) {
            descuento = totalCompra * 0.20;
        } else if (totalCompra >= 50000) {
            descuento = totalCompra * 0.10;
        } else {
            descuento = 0;
        }

        double totalConDescuento = totalCompra - descuento;

        System.out.println("Total de la compra: " + totalCompra);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total con descuento: " + totalConDescuento);

        scanner.close();
    }
}
