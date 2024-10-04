public class App {
    public static void main(String[] args) throws Exception {
        ElectricVehicle myEV =new ElectricVehicle("Tesla", "Model 3", 50000, 75, 500);
        myEV.start();
        myEV.displayInfo();
        myEV.displayRange();
        myEV.stop();

        System.out.println("..........................");

        Author author = new Author("Antoine");
        author.addBook("Principito",20);
        author.getBooks();

    }
}