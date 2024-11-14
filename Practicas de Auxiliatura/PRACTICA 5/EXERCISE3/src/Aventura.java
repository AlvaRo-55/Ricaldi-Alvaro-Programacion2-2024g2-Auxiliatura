import java.util.ArrayList;

public class Aventura {
    private ArrayList<Tarea>tareas;

    public Aventura() {
        this.tareas = new ArrayList<>();
    }

    public  void agregarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    
    public void iniciar(){
        System.out.println("............Comenzando Aventura..................");
        for (int i =0 ; i<tareas.size() ; i++){
            System.out.println("Ejecutando tarea:");
            tareas.get(i).ejecutar();
        }
        System.out.println("...........Aventura Finalizada...............");
    }
}
