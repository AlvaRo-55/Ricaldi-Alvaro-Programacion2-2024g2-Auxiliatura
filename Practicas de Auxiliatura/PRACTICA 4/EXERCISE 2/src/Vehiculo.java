public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    
    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void acelerar();  
    public abstract void frenar();  

    public void mostrarInfo(){
        System.out.println("marca:" + this.marca + "\n"+ "modelo:" + this.modelo + "\n"+ "velocidad maxima:" + this.velocidadMaxima);
    }

}
