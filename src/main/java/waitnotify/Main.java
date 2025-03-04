package waitnotify;

class cuentaBanacaria{
    private int saldo = 0;
    public synchronized void depositar ( int monto){
        saldo += monto;
        System.out.println("Deposito de $"+monto+". saldo actual: $"+ saldo);
        notify();
    }
    public synchronized void retirar(int monto) throws InterruptedException{
        while (saldo < monto) {
            System.out.println("saldo insuficinete para retirar $"+monto+" esperando deposito...");
            wait();
        }
        saldo -= monto;
        System.out.println("retuiro de $ "+monto+" exitoso. saldo actual: $"+saldo);
    }
    
}
public class Main {
    public static void main(String[] args) {
        cuentaBanacaria cuenta = new cuentaBanacaria();

        Thread retiro = new Thread(() ->{
            try{
                cuenta.retirar(500);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread deposito = new Thread(() -> {
            try{
                Thread.sleep(2000);
                cuenta.depositar(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });

        retiro.start();
        deposito.start();
    }
}