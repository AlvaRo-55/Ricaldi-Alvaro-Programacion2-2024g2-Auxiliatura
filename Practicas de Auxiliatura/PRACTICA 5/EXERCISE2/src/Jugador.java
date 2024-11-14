public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void aplicarBonificacion(CalculadoraBonificacion calculadora){
        this.puntos= calculadora.calcular(this.puntos);
    }

    public String toString(){
        return "jugador:" + nombre +" "+ "puntos:" + puntos;

    }
    
}
