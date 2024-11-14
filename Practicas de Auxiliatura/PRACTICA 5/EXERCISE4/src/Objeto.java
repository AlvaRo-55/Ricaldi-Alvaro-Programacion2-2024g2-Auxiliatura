public class Objeto {
    private String nombre;
    private double peso;

    public Objeto(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return String.format("Objeto:" + nombre + " Peso:" + peso +"kg");
    }

}
