package projePack;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        person person = new person();
        relation relation = new relation();
        Scanner scanner = new Scanner(System.in);




        System.out.println("Kisi ekleme ekranina hos geldiniz.");
        // burada root kontrolu yapmak gerekiyor.
        person.personAdder();//1. kisi eklendi parents bos relation bos
        person.personAdder();//2.kisi yaratildi
        System.out.println(person.persons.size());
        relation.relationAdder(person.persons.get(0),person.persons.get(1));
        person.personAdder();
        System.out.println(person.persons.size());
        System.out.println(relation.relations.size());
        System.out.println(relation.relations.get(0));

        person.childrenAdder(relation,0,2);
        person.persons.get(2).viewPersonInfo();





        //System.out.println(relation.relations.get(0).spouse1.name);



    }
}