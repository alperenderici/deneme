package projePack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class person {
    static int personCounter = 0;
    int id;
    relation parents;
    String name;
    String surname;
    String birthday;
    Boolean gender;

    ArrayList<person> persons = new ArrayList<person>();



    Scanner scanner = new Scanner(System.in);



    public person(){
        name = "bos";
        surname = "bos";
        birthday = "bos";
        gender = null;
    }

    public void personAdder(){
        System.out.println("======= AGACTA EKLEME YAPILACAK KISI BULUNMAMAKTA LUTFEN ONCE KENDINIZI EKLEYIN=====");

        relation tempRelation = new relation();

        System.out.println("Ad: ");
        String tempName = scanner.nextLine();
        System.out.println("Soyad: ");
        String tempSurname = scanner.nextLine();
        System.out.println("Doğum tarihi (GG.AA.YYYY): ");
        String tempBirthday = scanner.nextLine();
        System.out.println("Cinsiyet (E/K): ");
        String inputForGender = scanner.nextLine();
        Boolean tempGender;
        if (inputForGender.equals("E")){
            tempGender = true;
        }
        else if (inputForGender.equals("K")){
            tempGender = false;
        }
        else{
            tempGender = null;
        }

        persons.add(new person(tempRelation,tempName,tempSurname,tempBirthday,tempGender));

    }

    public void showPersons(person person) {
        for (int i =0;i<person.persons.size();i++) {
            person.viewPersonInfo();
        }
    }

     public void childrenAdder(relation relation,int relationID, int personID){
         relation.relations.get(relationID).children.add(persons.get(personID));
         persons.get(personID).parents=relation.relations.get(relationID);
         //Buraya baba anne belirtilcek

     }

     public void allRelations(){//TODO BURADAN DEVAM EDILECEK!!!!!!!
         if(parents.relations.isEmpty()){
             return;
         }
         if (parents.spouse1 == null){
             return;
         }
         if (parents.spouse1.gender) System.out.println("Baba ismi: "+ parents.spouse1.name+"\nAnne name: " + parents.spouse2.name);
         else {
             System.out.println("Baba ismi: "+ parents.spouse2.name+"\nAnne name: " + parents.spouse1.name);
         }
         if (parents.spouse1.parents.spouse1.gender) System.out.println("Dede ismi: "+ parents.spouse1.parents.spouse1.name+"\nBabaanne name: " + parents.spouse1.parents.spouse2.name);
         else {
             System.out.println("Dede ismi: "+ parents.spouse1.parents.spouse2.name+"\nBabaanne name: " + parents.spouse1.parents.spouse1.name);
         }
         if (parents.spouse2.parents.spouse1.gender) System.out.println("Dede ismi: "+ parents.spouse2.parents.spouse1.name+"\nAnneanne name: " + parents.spouse2.parents.spouse2.name);
         else {
             System.out.println("Dede ismi: "+ parents.spouse2.parents.spouse2.name+"\nAnneanne name: " + parents.spouse2.parents.spouse1.name);
         }

     }




    public void viewPersonInfo(){
        System.out.println("person name: "+ name);
        System.out.println("person surname: "+ surname);
        System.out.println("person birthday: "+ birthday);
        System.out.println("person gender: "+ gender);
        allRelations();
        System.out.println();
    }

    public person(projePack.relation parents, String name, String surname, String birthday, Boolean gender) {
        this.parents = parents;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        id = personCounter;
        personCounter++;
    }

    public projePack.relation getParents() {
        return parents;
    }

    public void setParents(projePack.relation parents) {
        this.parents = parents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Boolean isGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
