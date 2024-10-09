public class Vampiro extends Enemigo {
    public Vampiro(String nombre,int puntosDeVida,int dañoBase){
        super(nombre, puntosDeVida, dañoBase);
    }
    @Override
    public int atacar (){
        setPuntosDeVida(getPuntosDeVida()+getDañoBase()/2);
        return getDañoBase();
    }

}
