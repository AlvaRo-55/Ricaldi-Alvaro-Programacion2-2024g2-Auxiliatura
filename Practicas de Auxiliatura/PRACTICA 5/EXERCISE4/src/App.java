
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Inventario inventario = new Inventario();
        
        inventario.agregarObjeto(new Objeto("Espada", 5.0));
        inventario.agregarObjeto(new Objeto("Escudo", 7.5));
        inventario.agregarObjeto(new Objeto("Poción", 0.5));
        inventario.agregarObjeto(new Objeto("Arco", 2.0));
        inventario.agregarObjeto(new Objeto("Flecha", 0.1));
        inventario.agregarObjeto(new Objeto("Armadura", 15.0));

        inventario.mostrarInventario();

        List<Objeto> objetosPesados = inventario.filtrarObjetos(
            objeto -> objeto.getPeso() > 5.0
        );
        inventario.mostrarObjetosFiltrados(objetosPesados, "pesados >5 kg");

        List<Objeto> objetosLigeros = inventario.filtrarObjetos(
            objeto -> objeto.getPeso() < 1.0
        );
        inventario.mostrarObjetosFiltrados(objetosLigeros, "ligeros <1 kg");

        List<Objeto> objetosMedianos = inventario.filtrarObjetos(
            objeto -> objeto.getPeso() >= 1.0 && objeto.getPeso() <= 5.0
        );
        inventario.mostrarObjetosFiltrados(objetosMedianos, "de peso medio 1-5 kg");
    }
}
