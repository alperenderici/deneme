package projePack;

import java.util.ArrayList;

public class relation {
    person spouse1;
    person spouse2;

    ArrayList<person> children = new ArrayList<person>();
    ArrayList<person> mother = new ArrayList<person>();
    ArrayList<person> father = new ArrayList<person>();
    ArrayList<person> partner = new ArrayList<person>();
    ArrayList<person> brother = new ArrayList<person>();


    public relation(person spouse1, person spouse2) {
        this.spouse1 = spouse1;
        this.spouse2 = spouse2;
    }
}
