public class Coche extends Vehiculo implements Bocina{
    
    public Coche(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche esta acelerando");
    }

    @Override
    public void tocarBocina() {
        System.out.println("El coche hace beep beep");
    }

    @Override
    public void frenar() {
        System.out.println("El coche esta frenando" );
    }

}
