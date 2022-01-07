package projePack;

import java.util.ArrayList;

public class relation {
    person spouse1;
    person spouse2;
    static int relCounter = 1;
    int id;

    ArrayList<person> children = new ArrayList<person>();
    //ArrayList<person> mother = new ArrayList<person>();
    ArrayList<person> father = new ArrayList<person>();
    ArrayList<person> partner = new ArrayList<person>();
    ArrayList<person> brother = new ArrayList<person>(); //(brother / sister)

    ArrayList<relation> relations = new ArrayList<relation>();


    public void childrenAdder(relation relation,person person, int index){
        person.personAdder();
        System.out.println(person.persons.size());
        relation.relations.get(0).children.add(person.persons.get(2));
        //relation.children.add(person.persons.get(index));
        relation.children.get(0).parents = relation.relations.get(0);
        relation.viewPersonInfo(index);
    }
//    public void showChildren(){
//        for (int i =0; i<children.size(); i++){
//            person.viewPersonInfo(i);
//
//        }
//    }
public void viewPersonInfo(int index){
    System.out.println("person name: "+children.get(index).name);
    System.out.println("person surname: "+children.get(index).surname);
    System.out.println("person birthday: "+children.get(index).birthday);
    System.out.println("person gender: "+children.get(index).gender);
    System.out.println("relation: "+children.get(index).relation);
    System.out.println();
}

    public relation(){
    }

    public void relationAdder(person person1, person person2){
        relations.add(new relation(person1, person2));

    }


    public relation(person spouse1, person spouse2) {
        this.spouse1 = spouse1;
        this.spouse2 = spouse2;
        id = relCounter;
        relCounter++;
    }
}
