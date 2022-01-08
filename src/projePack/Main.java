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
        relation.relationAdder(person.persons.get(0),person.persons.get(1));
        person.personAdder();

        person.childrenAdder(relation,0,2);

        person.personAdder();//dede (baba)
        person.personAdder();//babaanne
        relation.relationAdder(person.persons.get(3),person.persons.get(4));
        person.childrenAdder(relation,1,0);


        person.personAdder();//dede
        person.personAdder();//anneanne
        relation.relationAdder(person.persons.get(5),person.persons.get(6));
        person.childrenAdder(relation,2,1);
        person.persons.get(2).viewPersonInfo();


        //System.out.println(relation.relations.get(0).spouse1.name);



    }
}
