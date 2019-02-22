/**
 * @author Galimberti_Francesco
 *
 * @version 4.0
 */
package clip;

/**
 * @author Galimberti_Francesco
 *
 * @brief Classe DatiCondivisi, si occupa di memorizzare e restituire il numero
 * di galoppi di ogni cavallo della gara, e di memorizzare e restituire tutti
 * gli output dei Thread
 */
public class DatiCondivisi {

    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attributo che memorizza il numero di galoppi del
     * cavallo1
     */
    int nClop1;
    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attributo che memorizza il numero di galoppi del
     * cavallo2
     */
    int nClop2;
    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attributo che memorizza il numero di galoppi del
     * cavallo3
     */
    int nClop3;
    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attributo che memorizza il numero di galoppi del
     * cavallo4
     */
    int nClop4;
    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attributo che memorizza il numero di galoppi del
     * cavallo5
     */
    int nClop5;

    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione di un vettore di stringhe nel quale vengono salvati gli
     * output dei Thread cavalli
     */
    String[] schermo;
    /**
     * @author Galimberti_Francesco
     *
     * Dichiarazione dell'attrbuto che memorizza la prima cella libera
     * dell'attributo schermo
     */
    int primaPosizioneLibera;

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo costruttore con parametri che inizializza a 0 i numeri di
     * galoppi di ogni cavallo e la prima posizione disponibile, inoltre
     * inizializza la dimensione del vettore di stringhe
     */
    public DatiCondivisi() {
        this.nClop1 = 0;
        this.nClop2 = 0;
        this.nClop3 = 0;
        this.nClop4 = 0;
        this.nClop5 = 0;

        schermo = new String[100000];
        primaPosizioneLibera = 0;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo accessore di default che restituisce il numero di galoppi
     * del cavallo1
     * @return nClop1 viene restituito un numero intero che indica il numero di
     * galoppi del cavallo1
     */
    public int getnClop1() {
        return nClop1;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo accessore di default che restituisce il numero di galoppi
     * del cavallo2
     * @return nClop2 viene restituito un numero intero che indica il numero di
     * galoppi del cavallo2
     */
    public int getnClop2() {
        return nClop2;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo accessore di default che restituisce il numero di galoppi
     * del cavallo4
     * @return nClop3 viene restituito un numero intero che indica il numero di
     * galoppi del cavallo3
     */
    public int getnClop3() {
        return nClop3;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo accessore di default che restituisce il numero di galoppi
     * del cavallo4
     * @return nClop4 viene restituito un numero intero che indica il numero di
     * galoppi del cavallo4
     */
    public int getnClop4() {
        return nClop4;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo accessore di default che restituisce il numero di galoppi
     * del cavallo5
     * @return nClop5 viene restituito un numero intero che indica il numero di
     * galoppi del cavallo5
     */
    public int getnClop5() {
        return nClop5;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo modificatore di default che modifica il numero di galoppi
     * del cavallo1
     * @param nClop1 il paramtero serve a passare al metodo un valore intero,
     * con cui modificare il valore dell'attributo nClop1, che corrisponde al
     * numero di galoppi del cavallo1
     */
    public void setnClop1(int nClop1) {
        this.nClop1 = nClop1;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo modificatore di default che modifica il numero di galoppi
     * del cavallo2
     * @param nClop2 il paramtero serve a passare al metodo un valore intero,
     * con cui modificare il valore dell'attributo nClop2, che corrisponde al
     * numero di galoppi del cavallo2
     */
    public void setnClop2(int nClop2) {
        this.nClop2 = nClop2;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo modificatore di default che modifica il numero di galoppi
     * del cavallo3
     * @param nClop3 il paramtero serve a passare al metodo un valore intero,
     * con cui modificare il valore dell'attributo nClop3, che corrisponde al
     * numero di galoppi del cavallo3
     */
    public void setnClop3(int nClop3) {
        this.nClop3 = nClop3;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo modificatore di default che modifica il numero di galoppi
     * del cavallo4
     * @param nClop4 il paramtero serve a passare al metodo un valore intero,
     * con cui modificare il valore dell'attributo nClop4, che corrisponde al
     * numero di galoppi del cavallo4
     */
    public void setnClop4(int nClop4) {
        this.nClop4 = nClop4;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo modificatore di default che modifica il numero di galoppi
     * del cavallo5
     * @param nClop5 il paramtero serve a passare al metodo un valore intero,
     * con cui modificare il valore dell'attributo nClop5, che corrisponde al
     * numero di galoppi del cavallo5
     */
    public void setnClop5(int nClop5) {
        this.nClop5 = nClop5;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo che permette di aggiungere al vettore "schermo" una stringa
     * passata come parametro, e di incrementare l'attributo che memorizza la
     * prima posizione libera del vettore
     *
     * @param s il parametro serve a passare al metodo una stringa che verrà
     * salvata nel vettore "schermo" nella posizione indicata dall'attributo
     * primaPosizioneLibera
     */
    public void aggiungiLinea(String s) {
        schermo[primaPosizioneLibera] = s;
        primaPosizioneLibera++;
    }

    /**
     * @author Galimberti_Francesco
     *
     * @brief Metodo che permette di visualizzare tutto il contenuto dello
     * schermo
     */
    public void visualizzaLinee() {
        for (int i = 0; i < this.primaPosizioneLibera; i++) {
            System.out.println(schermo[i]);
        }
    }

}
