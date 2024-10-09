// Ejercicio 7 Implementacion de un mini juego
import java.util.Scanner;

public class MiniJuego {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Guerrero guerrero = new Guerrero("Thor", 10, 100, 20);
            Mago mago = new Mago("Merlin", 10, 80, 50);
            Arquero arquero = new Arquero("Legolas", 10, 90, 30);
    
            Vampiro vampiro = new Vampiro("Drácula", 100, 15);
            Zombie zombie = new Zombie("Zombie", 50, 10);
            Jefe jefe = new Jefe("Zeus", 200, 25, 2.0);
    
            guerrero.getInventario().agregarItem("Espada");
            mago.getInventario().agregarItem("Posion");
            arquero.getInventario().agregarItem("Arco");
    
            boolean jugando = true;
    
            while (jugando) {
                System.out.println("Elige una acción:");
                System.out.println("1. Atacar con Guerrero");
                System.out.println("2. Atacar con Mago");
                System.out.println("3. Atacar con Arquero");
                System.out.println("4. Hablar con el Jefe");
                System.out.println("5. Mostrar inventario del Guerrero");
                System.out.println("6. Salir");
    
                int eleccion = scanner.nextInt();
    
                switch (eleccion) {
                    case 1:
                        guerrero.atacar();
                        vampiro.recibirDaño(guerrero.getFuerza());
                        System.out.println("El vampiro tiene " + vampiro.getPuntosDeVida() + " puntos de vida restantes.");
                        break;
                    case 2:
                        mago.LanzarHechizo();
                        zombie.recibirDaño(mago.getNivel() * 5);
                        System.out.println("El zombie tiene " + zombie.getPuntosDeVida() + " puntos de vida restantes.");
                        break;
                    case 3:
                        arquero.dispararFlecha();
                        jefe.recibirDaño(arquero.getNivel() * 3);
                        System.out.println("El jefe tiene " + jefe.getPuntosDeVida() + " puntos de vida restantes.");
                        break;
                    case 4:
                        scanner.nextLine(); 
                        String hablar = scanner.nextLine();
                        jefe.hablar();
                        break;
                    case 5:
                        guerrero.getInventario().mostrarItems();
                        break;
                    case 6:
                        jugando = false;
                        System.out.println("Fin del juego");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }

                if (!vampiro.estaVivo()) {
                    System.out.println("Vampiro derrotado");
                }
                if (!zombie.estaVivo()) {
                    System.out.println("Zombie derrotado");
                }
                if (!jefe.estaVivo()) {
                    System.out.println("Jefe derrotado");
                }
            }
    
            scanner.close();
        }
    }
    