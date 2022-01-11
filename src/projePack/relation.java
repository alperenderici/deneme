package projePack;

import java.util.ArrayList;

public class relation {
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

    public relation(){

    }

    public void relationAdder(projePack.person person1, projePack.person person2){
        relations.add(new relation(person1,person2));
    }


    public relation(projePack.person spouse1, projePack.person spouse2) {
        this.spouse1 = spouse1;
        this.spouse2 = spouse2;
        id = relCounter;
        relCounter++;
    }
}
