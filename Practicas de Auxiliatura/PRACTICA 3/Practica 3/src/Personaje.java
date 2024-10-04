public class Personaje {
    private String nombre;
    private Integer nivel;
    private Integer puntosDeVida;
    private Inventario inventario;

    public Personaje(String nombre,Integer nivel,Integer puntosDeVida){
        this.nombre=nombre;
        this.nivel=nivel;
        this.puntosDeVida=puntosDeVida;
        this.inventario= new Inventario();

    }

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(Integer puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public String mostrarEstado(){
        return 
        "Nombre: " + getNombre() + "\n" +
        "Nivel: " + getNivel() + "\n" +
        "Puntos de vida: " + getPuntosDeVida() + "\n";
    }

    public void recibirDaño(int daño){
        int nuevaVida = getPuntosDeVida() - daño;
        if (nuevaVida < 0) {
        nuevaVida = 0;
        }
        setPuntosDeVida(nuevaVida);
    }
    public void curar(){
        if (getPuntosDeVida() >= 100){
            System.out.println("Vida completamente llena");
        }
        else{
            setPuntosDeVida(getPuntosDeVida()+20);
        }
    }
}





