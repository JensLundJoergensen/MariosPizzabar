import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

    /* Når programmet vises, skal det være muligt at vælge om man blot vil se menuen eller vil gå igang med at lave ordreliste.

    Det skal være muligt for Alfonso, at trykke på en knap, der gør at han kan oprette en ordre, hvor han selv kan vælge
    hvilke pizzaer, der skal indgå i ordren og antal pizzaer. Når ordren er færdig, opdateres odreliste
    For hver gang Alfonso tilføjer en pizza opdateres ordrelisten,
    med den nye pizza, der er blevet tilføjet.

     Når han er færdig med at tilføje, skal det være muligt at afslutte programmet, ved at trykke på en bestemt knap fx.2
     herefter skal den samlede pris vises samt hvad tid den skal hentes.
     Til sidst vises beskeden "Ordre vidersendt", som skal indikere at ordren er sendt til Mario,
     så han ved hvilke pizzer der skal laves */

public class Main {
    public static void main(String[] args) {

        Pizza menu[] = Menukort.createMenu();

        ArrayList<Ordre> ordreListe = new ArrayList<>();

        choice();

        //Laver scanner for at få userinput i switch case
        Scanner sc = new Scanner(System.in);


        boolean UserExit = false;

        while(UserExit == false){

            switch (sc.nextInt()){

                case 1:
                    System.out.println(Arrays.toString(menu));
                    ordreListe.add(Ordre.createOrdre(menu));
                    System.out.println("tast 2 = afslut bestilling og se ordreliste");
                    break;

                case 2: //Vis ordre
                    Ordre.showOrdre(ordreListe);
                    System.out.println("tast 1 = lav ny bestilling");
                    System.out.println("tast 3 = sluk systemet");
                    break;

                case 3: //Exit
                    UserExit = true;
                    break;
                default:
                    System.out.println("Input ikke godkendt prøv igen");
                    System.out.println("tryk 1 for at starte bestilling");
                    System.out.println("tryk 2 for at vise ordre");
                    System.out.println("tryk 3 for at slukke systemet");
                    break;
            }

        }
    }

    public static void choice (){
        Scanner sc = new Scanner(System.in);
        System.out.println("tryk 1 for at starte bestilling");
        System.out.println("tryk 2 for at vise ordre");
        System.out.println("tryk 3 for at slukke systemet");
    }
}
