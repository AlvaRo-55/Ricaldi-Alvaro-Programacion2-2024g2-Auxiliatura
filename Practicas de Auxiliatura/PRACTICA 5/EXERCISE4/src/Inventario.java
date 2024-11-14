import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private ArrayList<Objeto> objetos;

    public Inventario() {
        this.objetos = new ArrayList<>();
    }

    public void agregarObjeto(Objeto objeto) {
        objetos.add(objeto);
    }

    public List<Objeto> filtrarObjetos(FiltroObjeto filtro) {
        List<Objeto> objetosFiltrados = new ArrayList<>();
        for (Objeto objeto : objetos) {
            if (filtro.filtrar(objeto)) {
                objetosFiltrados.add(objeto);
            }
        }
        return objetosFiltrados;
    }

    public void mostrarInventario() {
        System.out.println("Inventario completo:");
        objetos.forEach(System.out::println);
    }

    public void mostrarObjetosFiltrados(List<Objeto> objetosFiltrados, String criterio) {
        System.out.println("Objetos " + criterio + ":");
        objetosFiltrados.forEach(System.out::println);
    }
}
