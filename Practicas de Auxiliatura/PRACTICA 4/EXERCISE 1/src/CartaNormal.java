public class CartaNormal extends Carta implements DistribuirCarta {

    public CartaNormal(int valor, String palo) {
        super(valor, palo);
    }

    @Override
    public void	jugar(){
        System.out.println("La carta normal ha sido jugada");
    }

    @Override
    public void repartir(int cantidad) {
        System.out.println(cantidad + " cartas han sido repartidos para jugar");
    }
}
