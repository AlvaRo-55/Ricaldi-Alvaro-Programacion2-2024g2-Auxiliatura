public class Oveja extends Animal implements Productor,EsperanzaDeVida {

    public Oveja(String nombre, int edad,String especie) {
        super(nombre, edad,especie);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La oveja esta haciendo ¡BEEEE!");
    }

    @Override
    public void producir() {
        System.out.println("La oveja esta produciendo lana");
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("La oveja" + " " + getEspecie() + " " + "puede vivir 12 años");
    }
    
}
