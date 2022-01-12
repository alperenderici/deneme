package projePack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        person person = new person();
        relation relation = new relation();
        Scanner scan = new Scanner(System.in);
       boolean startUp = true;
       while (startUp) {
           startUp=true;
           entranceMenu();
           String inputForMenu = scan.nextLine();
           switch (inputForMenu) {
               case "1":
                   boolean startForAddPerson = true;
                   while (startForAddPerson) {
                       startForAddPerson = true;
                       System.out.println("Enter 1 to continue adding \n Enter 2 to add to person 0\n Enter 3 to add to person 0 \nEnter 0 to stop adding");
                       String inputForAdd = scan.nextLine();
                       if (person.persons.isEmpty()) {
                           System.out.println("Ilk kisi ekleme ");
                           person.personAdder();
                           break;
                       }
                       else {
                           System.out.println("Press 1 to add mother and father");
                           System.out.println("Press 2 to add partner");
                           System.out.println("Press 3 to add brother");
                           System.out.println("Press 4 to add children");
                           String inputForRelType = scan.nextLine();
                           switch (inputForRelType) {
                               case "1":
                                   person.personAdder(); //spouse 1 == father
                                   person.personAdder(); //spouse 2 == mother
                                   relation.relationAdder(); //spouse1 and spouse 2 relation
                                   break;
                               case "2":
                                   person.personAdder(); // partner
                                   relation.relationAdder(); // person 0 and relation
                                   break;

                           }

                       }



                   }
                   break;
               case "2":

                   break;

               case "3":

                   break;

               case "4":
                   break;
           }
       }


    }

    public static void entranceMenu() {
        System.out.println("Kişi eklemek için 1'e basın ");
        System.out.println("Kişi bilgisi güncellemek / silmek için 2'ye basın ");
        System.out.println("Devam etmek için herhangi bir tuşa basın");
        System.out.println("Kapatmak için 0'a basın\n\nGiriniz: ");
    }
}
