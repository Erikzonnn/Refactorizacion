public class Main {
    private CCuenta cuenta1;

    public Main() {
        cuenta1 = new CCuenta();
    }
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.operativa_cuenta(1000.0f);
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    private void operativa_cuenta(float v) throws Exception {
        // Realizar operaciones con el objeto cuenta1
        cuenta1.estado();
        cuenta1.retirar(2300);
        cuenta1.ingresar(695);
    }
}
