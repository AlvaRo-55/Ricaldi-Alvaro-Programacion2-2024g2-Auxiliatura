public abstract class Animal {

    private String nombre;
    private int edad;
    private String especie;

    public Animal(String nombre, int edad,String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie= especie; 
    }


    public String getEspecie() {
        return especie;
    }
    

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public abstract void hacerSonido();

    public void mostrarInfo(){
        System.out.println("nombre;"+ this.nombre + "\n" +"edad:" + this.edad + "\n" +"peso:" + this.especie);
    }
}
