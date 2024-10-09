public class App {
    public static void main(String[] args) throws Exception {
        Vaca vaca1 = new Vaca("Cacao", 10, "Holstein");
        Oveja oveja1 = new Oveja("Nuve", 4, "Dorper");

        vaca1.mostrarInfo();
        vaca1.hacerSonido();
        vaca1.producir();
        vaca1.tiempoDeVida();

        System.out.println();

        oveja1.mostrarInfo();
        oveja1.hacerSonido();
        oveja1.producir();
        oveja1.tiempoDeVida();

    }
}
