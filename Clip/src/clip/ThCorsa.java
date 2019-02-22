/**
 * @author Galimberti_Francesco
 *
 * @version 4.0
 */
package clip;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Galimberti_Francesco
 *
 * @brief Classe ThCorsa, si occupa di simulare il galoppo di un cavallo
 */
public class ThCorsa extends Thread {

    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attributo che memorizza il numero del cavallo
     */
    private final int nThread;
    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attributo che memorizza se si vuole utilizzare
     * lo sleep
     */
    private final boolean usaSleep;
    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attributo che memorizza se si vuole utilizzare
     * lo yeld
     */
    private final boolean usaYield;
    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attributo puntatore che servisà a salvare informazioni
     * sul cavallo
     */
    private final DatiCondivisi ptrDati;

    /**
     * @author Galimberti_Francesco
     * 
     * @brief Costruttore con parametri che permette di inizializzare il numero
     * del cavallo, un oggetto nel quale verranno memorizzate informazione sul 
     * cavallo e l'utilizzo o meno dello yeld e dello sleep.     
     * 
     * @param nThread il parametro serve per passare al metodo un valore intero
     * per inizializzare l'attributo che memorizza il numero del cavallo
     * @param usaSleep il parametro serve per passare al metodo un valore booleano per
     * permettere l'utilizzo o meno dello sleep
     * @param usaYield il parametro serve per passare al metodo un valore booleano per
     * permettere l'utilizzo o meno dello yeld
     * @param ptrDati il parametro serve a passare al metodo un puntatore
     * DatiCondivisi dove verrà memorizzato il numero di galoppi del cavallo
     */
    public ThCorsa(int nThread, boolean usaSleep, boolean usaYield, DatiCondivisi ptrDati) {
        this.nThread = nThread;
        this.usaSleep = usaSleep;
        this.usaYield = usaYield;
        this.ptrDati = ptrDati;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo rappresentante il main del Thread
     *
     * Il metodo serve a simulare il galoppo del cavallo. Il cavallo continua a
     * galoppare e il numero dei galoppi incrementato, fino a quando la gara 
     * termina. Il Thread quindi provvederà a salvare il numero dei galoppi.
     * Ad ogni galoppo effettuato verrà salvata una stringa in un vettore 
     * richiamando il metodo opportuno.
     */
    @Override
    public void run() {
        int n = 0;
        Random nRand=new Random();        
        try {
            while (true) {
                n++;
                ptrDati.aggiungiLinea("Clop" + nThread);
                
                if (usaSleep) {
                    Thread.sleep(nRand.nextInt(100)+1);
                }
                if (usaYield) {
                    Thread.yield();
                }

                if (Thread.currentThread().isInterrupted()) {
                    break;
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ThCorsa.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (this.nThread) {
            case 1:
                ptrDati.setnClop1(n);
                break;
                
            case 2:
                ptrDati.setnClop2(n);
                break;
                
            case 3:
                ptrDati.setnClop3(n);
                break;
                
            case 4:
                ptrDati.setnClop4(n);
                break;
                
            case 5:
                ptrDati.setnClop5(n);
                break;
                
            default:
                break;

        }
    }
}
