public class Mago extends Personaje {
    private int  mana;

    public Mago(String nombre, Integer nivel, Integer puntosDeVida, int mana) {
        super(nombre, nivel, puntosDeVida);
        this.mana = mana;
    }
    public void LanzarHechhizo(){
        System.out.println("El mago ha lanzado un hechizo" );
    }
}
