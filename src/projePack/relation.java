package projePack;

import java.util.ArrayList;
import java.util.Scanner;

public class relation {
    person person;
    projePack.person spouse1;
    projePack.person spouse2;
    static int relCounter = 1;
    int id;

    ArrayList<relation> relations = new ArrayList<relation>();
    ArrayList<projePack.person> children = new ArrayList<projePack.person>();
    ArrayList<projePack.person> father = new ArrayList<projePack.person>();
    ArrayList<projePack.person> mother = new ArrayList<projePack.person>();
    ArrayList<projePack.person> partner = new ArrayList<projePack.person>();
    ArrayList<projePack.person> brother = new ArrayList<projePack.person>();
    Scanner scan = new Scanner(System.in);

    public relation(){

    }

    public void relationAdder() {

        System.out.println("Enter spouse 1's id");
        int spouse1ID = scan.nextInt();
        System.out.println("Enter spouse 2's id");
        int spouse2ID = scan.nextInt();

        for (int i = 0;i<person.persons.size();i++) {
            if (!(person.persons.get(i).id == spouse1ID)) {
                System.out.println("Cant found");
                return;
            }
        }
        for (int i = 0;i<person.persons.size();i++) {
            if (!(person.persons.get(i).id == spouse2ID)) {
                System.out.println("Cant found");
                return;
            }
        }
        relations.add(new relation(person.persons.get(spouse1ID),person.persons.get(spouse2ID)));

    }



    public relation(projePack.person spouse1, projePack.person spouse2) {
        this.spouse1 = spouse1;
        this.spouse2 = spouse2;
        id = relCounter;
        relCounter++;
    }
}
