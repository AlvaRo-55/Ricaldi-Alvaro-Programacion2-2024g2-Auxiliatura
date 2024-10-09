public class CartaEspecial extends Carta implements Accionable{
    private String poderCarta;
    public CartaEspecial(int valor, String palo,String poderCarta) {
        super(valor, palo);
        this.poderCarta = poderCarta;
    }

    @Override
    public void jugar (){
    System.out.println("La carta especial ha sido juagada");
    }

    @Override
    public void realizarAccion(){
        System.out.println("La carta especial ha activado su poder de :" + this.poderCarta);
    }
}