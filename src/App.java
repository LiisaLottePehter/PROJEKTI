import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        //Küsimused peab siia looma
        String küs1 = "Kui palju meeldib matemaatika?" + "\n1\n2\n3\n4\n5";
        String küs2 = "Kui palju meeldib proge?" + "\n1\n2\n3\n4\n5";
        String küs3 = "Kui palju meeldib äri?" + "\n1\n2\n3\n4\n5";
        String küs4 = "Kui palju meeldib juhtimine?" + "\n1\n2\n3\n4\n5";

        //Arraylistid erinevate valdkondade kohta, et määrata küsimustele õiged vastused
        Informaatika [] informaatikaKüsimused = {
                new Informaatika(küs1, "2", "valdkond"), new Informaatika(küs2, "5", "valdkond")
        };
        Majandus[] majandusKüsimused = {
                new Majandus(küs3, "2", "valdkond"), new Majandus(küs4, "5", "valdkond")
        };

        //Käivitamine
        teeTest(informaatikaKüsimused);
        teeTest(majandusKüsimused);

    }


    //Testi tegemise meetod
    public static void teeTest(Küsimused[] küsimused){
        int tulemus = 0;
        Scanner keyboardInput = new Scanner(System.in);

        //Läbib küsimuste listi ükshaaval
        for (int i = 0; i < küsimused.length; i++) {

            //Prindib küsimuse
            System.out.println(küsimused[i].küsimus);
            //Määrab vastuse inputiks, mida sisestatakse. Lisab tulemusele sisestuse kui on õiges vahemikus.
            String vastus = keyboardInput.nextLine();
            if (Integer.parseInt(vastus) >= 1 && Integer.parseInt(vastus) <= 5)
                tulemus += Integer.parseInt(vastus);
                //Kui ei ole õiges vahemikus siis läheb selle küsimuse juurde tagasi
            else{
                System.out.println("Sisesta õige number palun");
                i--;
            }


        }
        //küsimused.getClass().toString() on ainus viis kuidas hetkel leidsin et saaks valdkonna ka väljastada
        //Tuleb midagi paremat välja mõelda
        System.out.println( "Said " + tulemus + "/10 punkti valdkonnas " + küsimused.getClass().toString());

    }
}
