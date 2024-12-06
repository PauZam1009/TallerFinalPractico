import java.util.ArrayList;
import java.util.List;

public class SepararDatos {
    public static void main(String[] args) {

        String[] datos = {"antony", "32", "fredy", "43", "maria", "23"};


        List<String> nombres = new ArrayList<>();
        List<String> edades = new ArrayList<>();


        for (int i = 0; i < datos.length; i++) {
            if (i % 2 == 0) {

                nombres.add(datos[i]);
            } else {

                edades.add(datos[i]);
            }
        }

        System.out.println("Lista Nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("\nLista Edades:");
        for (String edad : edades) {
            System.out.println(edad);
        }
    }
}
