public class App {
    public static void main(String[] args) throws Exception {
        Jugador jugador1 = new Jugador("Jose",100);
        Jugador jugador2 = new Jugador("Marylin",150);
        System.out.println("...........Puntos actuales.............");
        System.out.println(jugador1);
        System.out.println(jugador2);

        CalculadoraBonificacion bonificacionPorcentajeDe50= puntos -> puntos + (puntos/2);

        CalculadoraBonificacion bonificacionDoble = puntos -> puntos * 2;

        System.out.println("............Aplicando bonificaciones...........");

        jugador1.aplicarBonificacion(bonificacionPorcentajeDe50);
        System.out.println(jugador1);

        jugador2.aplicarBonificacion(bonificacionDoble);
        System.out.println(jugador2);
    }
}
