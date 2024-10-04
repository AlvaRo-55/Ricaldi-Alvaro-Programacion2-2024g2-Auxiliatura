public class Guerrero extends Personaje {
    private int fuerza ;

    public Guerrero(String nombre, Integer nivel, Integer puntosDeVida, int fuerza) {
        super(nombre, nivel, puntosDeVida);
        this.fuerza = fuerza;
    }

    public void atacar(){
        System.out.println("El guerrero ha realizado un ataque ");
    }
}
