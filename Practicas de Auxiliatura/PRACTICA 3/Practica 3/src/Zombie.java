public class Zombie extends Enemigo{
    public Zombie(String nombre,int puntosDeVida,int dañoBase){
        super(nombre, puntosDeVida, dañoBase);
    }
    @Override
    public int atacar(){
        setPuntosDeVida(getPuntosDeVida()+5);
        return getDañoBase();
    }

    
    
}
