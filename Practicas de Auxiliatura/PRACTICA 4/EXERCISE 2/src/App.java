public class App {
    public static void main(String[] args) throws Exception {
        Coche coche1 = new Coche("Ford", "mustanX", 1000);
        Moto moto1 = new Moto("Honda", "cBR600RR", 1220);

        coche1.mostrarInfo();
        coche1.acelerar();
        coche1.tocarBocina();
        coche1.frenar();

        System.out.println();

        moto1.mostrarInfo();
        moto1.acelerar();
        moto1.activarTurbo();
        moto1.frenar();
    }
}
