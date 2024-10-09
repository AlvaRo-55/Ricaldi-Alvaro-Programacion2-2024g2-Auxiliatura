public abstract class Carta {
    private int valor;
    private String palo;
    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }
    
    
    public int getValor() {
        return valor;
    }


    public void setValor(int valor) {
        this.valor = valor;
    }


    public String getPalo() {
        return palo;
    }


    public void setPalo(String palo) {
        this.palo = palo;
    }


    public abstract void jugar();


    public void mostrarCarta(){
        System.out.println("Valor:" + this.valor + "\n" +"Palo:" + this.palo);
    }
}
