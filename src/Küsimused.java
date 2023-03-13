import java.util.ArrayList;

public class Küsimused {
    String küsimus;
    String vastus;
    String valdkond;

    //Siin katsetasin kas saaks hea meetodi, et soutida küsimuste järgi valdkond aga ei tulnud välja
    public static String Valdkond(String[] küsimused) {
        return "Täpsustamata";
    }

    public Küsimused(String küsimus, String vastus, String valdkond){
        this.küsimus = küsimus;
        this.vastus = vastus;
        this.valdkond = valdkond;
    }
    public Küsimused(){
        super();
    }

    //Teeks siia eraldi meetodi, mis loeb punkte
    public int majandus_kokku_punkte(ArrayList<String> küsimused){
        //Äkki teeks nüüd if lauseid, et kui küs1 vastab viis siis lisab need punktid loendurisse
        int majanduskokku = 0;
        int itkokku = 0;
        int matkokku = 0;
        int matstatkokku = 0;
        //igal erialal võrdne arv küsimusi ja siis loeb need tsükli abi
        for (int i = 0; i < küsimused.size(); i++) {
            if (küsimus == "1") {
                majanduskokku += 5;
            }
            if (küsimus == "5") {
                majanduskokku += 1;
            }
        }
        //Ja jätkaks nii aga siis peame lihtsalt teadma, mis küsimus igal kohal asub
        return majanduskokku;
    }
}
