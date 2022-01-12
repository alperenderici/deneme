package projePack;
import projePack.UI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        person person = new person();
        relation relation = new relation();

        System.out.println("Kişi ekleme hoş geldiniz.");
        person.personAdder();//ilk kisi eklendi id=0

        person.personAdder();//babam id=1
        person.personAdder();//annem id=2
        relation.relationAdder(person.persons.get(0),person.persons.get(1)); //relid = 0
        person.childrenAdder(relation,0,0);

        person.personAdder();//amcam id=3
        person.childrenAdder(relation,1,5);



    }
}
