package projePack;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        person a = new person(null, "Alperen", "Derici", "01111998", "erkek",null); // create new projePack.person object
        person b = new person(null,"Alperen","Dercii","01111998","erkek",null); // create new projePack.person object
        relation rel = new relation(null,null); // create new projePack.relation object
        rel.spouse1 = a;
        rel.spouse2 = b;
        a.relation.add(rel);
        b.relation.add(rel);

        person c = new person(null,"Alperen","Dercii","01111998","erkek",null); // create new projePack.person object

        rel.children.add(c);

        c.parents = rel;

        System.out.println(c.parents);

    }
}
