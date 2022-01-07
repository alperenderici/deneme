package projePack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        person person = new person();
        relation relation = new relation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("To Add Person Pres 1\n" +
                "To Delete Person Press 2\n" +
                "To Edit Person Press 3\n" +
                "To View Person Press 4\n ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1://cok yanlis oldu burasi
                System.out.println("Kisi ekleme ekranina hos geldiniz.");
                // burada root kontrolu yapmak gerekiyor.
                person.personAdder();//1. kisi eklendi parents bos relation bos
                person.personAdder();//2.kisi yaratildi

                relation.relationAdder(person.persons.get(0),person.persons.get(1));
                relation.childrenAdder(relation.relations.get(0),person,0);
                //person.showPersons();



                //System.out.println(relation.relations.get(0).spouse1.name);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;

        }
    }
}
