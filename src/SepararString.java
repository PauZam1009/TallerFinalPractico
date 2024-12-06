import java.util.ArrayList;
import java.util.List;

public class SepararString {
    public static void main(String[] args) {

        String str = "antony|fredy|julian|marcos";

        String[] nombresArray = str.split("\\|");

        List<String> nombresList = new ArrayList<>();

        for (String nombre : nombresArray) {
            nombresList.add(nombre);
        }

        System.out.println("Lista de nombres:");
        for (String nombre : nombresList) {
            System.out.println(nombre);
        }
    }
}
