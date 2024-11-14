public class App {
    public static void main(String[] args) throws Exception {
        Evento fiesta = new Evento ("fiesta de cumpleaños");
        Evento concierto = new Evento("Concierto de Cumbia");

        fiesta.registrarNotificacion((String mensaje) ->
        System.out.println("sms" +" " + mensaje));

        fiesta.registrarNotificacion((String mensaje) ->
        System.out.println("gmail" + " " +mensaje));

        concierto.registrarNotificacion((String mensaje) ->
        System.out.println("notificacion" + mensaje));

        concierto.registrarNotificacion((String mensaje) ->
        System.out.println("gmail" + " " + mensaje));

        System.out.println("...........Eventos activados....");
        fiesta.activar();
        System.out.println("..................................");
        concierto.activar();
    }
}
