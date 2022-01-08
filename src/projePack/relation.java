package projePack;

import java.util.ArrayList;
import java.util.List;

class relation {
    person spouse1;
    person spouse2;
    static int relCounter = 1;
    int id;

    ArrayList<relation> relations = new ArrayList<relation>();
    ArrayList<person> children = new ArrayList<person>();






    /*public void childrenAdder(person person, int index){
        System.out.println(person.persons.size());
        relations.get(0).spouse1.viewPersonInfo();
        person.personAdder();
        relations.get(0).children.add(person.persons.get(index));



    }*/
    //    public void showChildren(){
//        for (int i =0; i<children.size(); i++){
//            person.viewPersonInfo(i);
//
//        }
//    }


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