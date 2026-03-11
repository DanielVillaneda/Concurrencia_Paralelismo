class HiloSuma extends Thread {

    private int inicio;
    private int fin;
    private long resultado;

    public HiloSuma(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public void run() {

        resultado = 0;

        for (int i = inicio; i <= fin; i++) {
            resultado += i;
        }

        System.out.println("Suma desde " + inicio + " hasta " + fin + " = " + resultado);
    }

    public long getResultado() {
        return resultado;
    }
}

public class ParalelismoSuma {

    public static void main(String[] args) {

        HiloSuma h1 = new HiloSuma(1, 250000);
        HiloSuma h2 = new HiloSuma(250001, 500000);
        HiloSuma h3 = new HiloSuma(500001, 750000);
        HiloSuma h4 = new HiloSuma(750001, 1000000);

        h1.start();
        h2.start();
        h3.start();
        h4.start();

        try {

            h1.join();
            h2.join();
            h3.join();
            h4.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long sumaTotal = h1.getResultado() + h2.getResultado() + h3.getResultado() + h4.getResultado();

        System.out.println("Suma total = " + sumaTotal);
    }
}