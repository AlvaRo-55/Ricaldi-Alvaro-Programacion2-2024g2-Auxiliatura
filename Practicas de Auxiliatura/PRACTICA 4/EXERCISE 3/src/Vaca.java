public class Vaca extends Animal implements Productor,EsperanzaDeVida{

    public Vaca(String nombre, int edad,String especie) {
        super(nombre, edad,especie);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La vaca esta haciendo ¡MUUUU!");
    }

    @Override
    public void producir() {
        System.out.println("La vaca esta produciendo leche");
    }

    @Override
    public void tiempoDeVida() {
        System.out.println("La vaca" +" " + getEspecie() + " " + "puede vivir 25 años");
    }
    
}
