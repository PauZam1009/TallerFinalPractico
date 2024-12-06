public class Persona {
    String nombre;
    int edad;
    double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
    }
    public static void main(String[] args) {

        Persona persona1 = new Persona("Paula", 30, 1.59);

        persona1.imprimirDatos();
    }
}
