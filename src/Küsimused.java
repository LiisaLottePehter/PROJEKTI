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

}
