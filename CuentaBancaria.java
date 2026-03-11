class Cuenta {

    private int saldo = 1000;

    public synchronized void retirar(String cliente, int cantidad) {

        if (saldo >= cantidad) {

            System.out.println(cliente + " va a retirar " + cantidad);

            saldo -= cantidad;

            System.out.println("Saldo restante: " + saldo);

        } else {

            System.out.println(cliente + " no pudo retirar dinero. Saldo insuficiente.");

        }
    }
}

class Cliente extends Thread {

    private Cuenta cuenta;
    private String nombre;

    public Cliente(Cuenta cuenta, String nombre) {
        this.cuenta = cuenta;
        this.nombre = nombre;
    }

    public void run() {
        cuenta.retirar(nombre, 400);
    }
}

public class CuentaBancaria {

    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();

        Cliente c1 = new Cliente(cuenta, "Cliente 1");
        Cliente c2 = new Cliente(cuenta, "Cliente 2");
        Cliente c3 = new Cliente(cuenta, "Cliente 3");

        c1.start();
        c2.start();
        c3.start();
    }
}