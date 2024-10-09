// Ejercicio 4 juego simple de combate
public class Combate {
    public static void main(String[] args) throws Exception {
        
        Mago mago1 = new Mago("Merlin", 30, 100, 50);
        Guerrero guerrero1 = new Guerrero("Hercules", 50, 100, 120);

        System.out.println("................comienza el combate...............");

        do {
            System.out.println("...............Turno del mago..................");

            mago1.LanzarHechizo();
            mago1.recibirDaño(15);

            System.out.println("...............Turno del guerrero.................");

            guerrero1.atacar();
            guerrero1.recibirDaño(19);

            System.out.println("..............Estado de los personajes................");

            System.out.println(mago1.mostrarEstado());
            System.out.println(guerrero1.mostrarEstado());

        } while (mago1.getPuntosDeVida() >0  && guerrero1.getPuntosDeVida() >0);

        if (guerrero1.getPuntosDeVida() <= 0) {
            System.out.println("El guerrero " + guerrero1.getNombre() + " ha sido derrotado.");
        }
        else if(mago1.getPuntosDeVida() <= 0) {
            System.out.println("El mago " + mago1.getNombre() + " ha sido derrotado.");
        }
    }
}
