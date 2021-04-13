package teoria.hilos.estados;

public class HiloProceso extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Letrero: " + i + " " + this.getName());
            try {
                HiloProceso.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en el bucle: " + e);
            }
        }
    }
}
