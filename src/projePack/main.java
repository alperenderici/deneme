package projePack;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        person a = new person(null, "Alperen", "Derici", "01111998", true); // create new projePack.person object
        person b = new person(null,"Alperen","Dercii","01111998",false); // create new projePack.person object
        relation rel = new relation(null,null); // create new projePack.relation object
        rel.spouse1 = a;
        rel.spouse2 = b;
        a.relation.add(rel);
        b.relation.add(rel);

        person c = new person(null,"Alperen","Dercii","01111998",true); // create new projePack.person object

        rel.children.add(c);
        c.parents = rel;


        rel.father.add(a);
        rel.partner.add(b); //Bunu buraya c den ekliyorsak mother olur a dan ekliyorsak partner olur eger kendisinden ekliyorsak??
        System.out.println(rel);

    }
}
