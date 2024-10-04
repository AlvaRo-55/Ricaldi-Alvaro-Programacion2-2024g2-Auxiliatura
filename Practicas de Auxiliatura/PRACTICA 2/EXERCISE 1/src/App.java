import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        String cadena=scanner.nextLine();
        String formatoNuevo=cambioFormato(cadena);
        System.out.print(formatoNuevo);
        scanner.close();
    }

    public static String cambioFormato(String cadena){
        SimpleDateFormat entrada =new SimpleDateFormat("d 'de' MMMM,yyyy");
        SimpleDateFormat salida=new SimpleDateFormat("d/MM/yyyy");
        try{
            Date fecha =entrada.parse(cadena);
            return salida.format(fecha);
        }catch(ParseException e){
            return("La fecha es incorrecta");
        }
    }
}
