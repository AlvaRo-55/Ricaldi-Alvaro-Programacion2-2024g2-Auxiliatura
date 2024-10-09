public class Jefe extends Enemigo {
    private double multiplicadorDeDaño;

    public Jefe(String nombre, int puntosDeVida, int dañoBase, double multiplicadorDeDaño) {
        super(nombre, puntosDeVida, dañoBase);
        this.multiplicadorDeDaño = multiplicadorDeDaño;
    }

    public double getMultiplicadorDeDaño() {
        return multiplicadorDeDaño;
    }

    public void hablar(){
        System.out.println("Tu valentia sera tu ruina.");
    }
    
    public int ataqueCritico(){
        return (int)(getDañoBase()*getMultiplicadorDeDaño());

    }

}
