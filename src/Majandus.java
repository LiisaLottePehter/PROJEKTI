public class Majandus extends Küsimused{
    public Majandus(String küsimus, String vastus, String valdkond) {
        super(küsimus, vastus, valdkond);
    }

    //Siin katsetasin kas saaks hea meetodi, et soutida küsimuste järgi valdkond aga ei tulnud välja
    public Majandus() {
        valdkond = "majandus";
    }

    //Siin katsetasin kas saaks hea meetodi, et soutida küsimuste järgi valdkond aga ei tulnud välja
    @Override
    public String toString() {
        return "Valdkonnas majandus sinu punktid: ";

    }
}
