
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String leer = scanner.nextLine();
            lista.add(leer);
        }
        
        System.out.println("Introduce la letra para contar palabras que empiezan con ella:");
        char letra = scanner.nextLine().charAt(0);
        
        int cont = mismaLetra(lista, letra);
        System.out.println( cont);
        
        scanner.close();
    }
    public static int mismaLetra(ArrayList<String> lista, char letra) {
        int cont = 0;
        for (int i = 0; i < lista.size(); i++) {
            String palabra = lista.get(i);
            if (palabra.charAt(0) == letra) {
                cont++;
            }
        }
        return cont;
    }
}

