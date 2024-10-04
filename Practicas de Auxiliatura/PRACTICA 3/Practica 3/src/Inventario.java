import java.util.ArrayList;
public class Inventario {
    private ArrayList<String> items;

    public Inventario() {
        items = new ArrayList<>();
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public void agregarItem( String item){
        items.add(item);
    }
    public void mostrarItems(){
        for (String mostrar:items){
            System.out.println(mostrar);
        }
    }


}
