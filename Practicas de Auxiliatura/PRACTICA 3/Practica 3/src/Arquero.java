public class Arquero extends Personaje {
    private int destreza;

    public Arquero(String nombre, Integer nivel, Integer puntosDeVida, int destreza) {
        super(nombre, nivel, puntosDeVida);
        this.destreza = destreza;
    }

    public void dispararFlecha(){
        int daño = destreza * 2;
        System.out.println("El arquero ha disparado una flecha con destreza de " + destreza + " causando " + daño + " puntos de daño.");
    }
}
