public class App {
    public static void main(String[] args) throws Exception {
        Aventura aventura1 = new Aventura();
        Aventura aventura2 = new Aventura();

        aventura1.agregarTarea(() ->{
            System.out.println("Explorando el mundo");
            System.out.println("Descubriendo nuevos materiales");
            System.out.println("Ganando experiencia");
        });
        
        aventura2.agregarTarea(() ->{
            System.out.println("Viajando  al espacio");
            System.out.println("Descubriendo nuevos planetas");
            System.out.println("Conociendo nuevas especies");
        });

        aventura1.iniciar();
        System.out.println("..................................");
        aventura2.iniciar();
    }
}

