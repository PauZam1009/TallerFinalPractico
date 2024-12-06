public class Concatenar {
    public static void main(String[] args) {

        String miNombre = "antony";
        int miEdad = 15;
        String profesion = "ingeniero de sistemas";

        miNombre = miNombre.toUpperCase();


        profesion = profesion.substring(0, 1).toUpperCase() + profesion.substring(1);

        System.out.println(miNombre + " tiene " + miEdad + " años y su profesion es " + profesion);
    }
}
