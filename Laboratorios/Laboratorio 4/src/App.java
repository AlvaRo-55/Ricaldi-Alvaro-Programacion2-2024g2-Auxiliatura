public class App {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));

        store.addProduct(new Accessory("Mouse", 20.0));
        store.addProduct(new Accessory("Keyboard", 47.0));
        
        //  Apply a 10% discount
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        store.applyDiscount(tenPercentDiscount);

        // Apply a fixed discount of $50
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        store.applyDiscount(fiftyDollarsDiscount);

        // Descuento combinado 
        Discountable combinedDiscount = product -> (product.getPrice() * 0.9 - 10.0);
        store.applyDiscount(combinedDiscount);
        
        // Descuento variable
        Discountable variableDiscount = product -> {
            if (product instanceof Electronic) {
                return product.getPrice() * 0.85;  // 15% de descuento para electrónicos
            } else if (product instanceof Accessory) {
                return product.getPrice() * 0.90;  // 10% de descuento para accesorios
            } else {
                return product.getPrice();
            }
        };
        store.applyDiscount(variableDiscount);
    }
}
