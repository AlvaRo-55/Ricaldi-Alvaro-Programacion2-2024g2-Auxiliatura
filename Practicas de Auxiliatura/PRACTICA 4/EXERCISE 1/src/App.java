public class App {
    public static void main(String[] args) throws Exception {
        CartaNormal carta1 = new CartaNormal(4, "diamante");
        CartaEspecial cartaEsp = new CartaEspecial(3, "trebol", "quitar una carta");

        carta1.repartir(20);
        carta1.jugar();
        carta1.mostrarCarta();

        System.out.println();

        cartaEsp.jugar();
        cartaEsp.mostrarCarta();
        cartaEsp.realizarAccion();

    }
}
