public class Enemigo {
    private String nombre;
    private int puntosDeVida;
    private int dañoBase;
    public Enemigo(String nombre, int puntosDeVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.dañoBase = dañoBase;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getPuntosDeVida() {
        return puntosDeVida;
    }


    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }


    public int getDañoBase() {
        return dañoBase;
    }


    public void setDañoBase(int dañoBase) {
        this.dañoBase = dañoBase;
    }


    public int atacar(){
        return getDañoBase();
    }

    public  void recibirDaño(int daño){
        setPuntosDeVida(getPuntosDeVida()-daño);
    }
    
    public boolean estaVivo(){
        return getPuntosDeVida()>0;
    }
    
    
}
