public class Mago extends Personaje {
    private int  mana;

    public Mago(String nombre, Integer nivel, Integer puntosDeVida, int mana) {
        super(nombre, nivel, puntosDeVida);
        this.mana = mana;
    }
    public void LanzarHechizo(){
        if (mana >= 10) {
            System.out.println("El mago ha lanzado un hechizo");
            mana -= 10; 
        } else {
            System.out.println("No tienes suficiente maná para lanzar un hechizo.");
        }
    }
}
