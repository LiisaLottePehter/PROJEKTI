public class Informaatika extends Küsimused{
    public static void main(String[] args) {

    }

    public Informaatika(String küsimus, String vastus, String valdkond) {
        super(küsimus, vastus, valdkond);
        this.valdkond = "informaatika";
    }

    //Siin katsetasin kas saaks hea meetodi, et soutida küsimuste järgi valdkond aga ei tulnud välja
    public static String Valdkond() {
        return "Informaatika";
    }

    //Siin katsetasin kas saaks hea meetodi, et soutida küsimuste järgi valdkond aga ei tulnud välja
    @Override
    public String toString() {
        return "Valdkonnas" + valdkond + "sinu punktid: ";

    }
}
