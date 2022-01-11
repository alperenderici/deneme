package projePack;

import projePack.UI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class person {
    static int personCounter = 0;
    int id;
    relation parents;
    String name;
    String surname;
    String birthday;
    Boolean gender;


    ArrayList<person> persons = new ArrayList<person>();

    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    public person(){
        name = "bos";
        surname = "bos";
        //birthday = new Date(0,0,0,0,0,0);
        birthday = "bos";
        gender = null;
    }

    public void personAdder(){
        //TODO agacta ekleme yapilacak kisi bulunamamakta kontrolu (ilk kisi icin)
        System.out.println("Kisi bilgilerini giriniz");
        relation tempRelation = new relation();
        System.out.println("Ad: ");
        String tempName =
        System.out.println("Soyad: ");
        String tempSurname = ui.textFieldSoyad.getText();
        System.out.println("Doğum tarihi (dd/MM/yyyy): ");
        String tempDate = ui.textFieldDogumTarihi.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date2=null;
        try {
            //Parsing the String
            date2 = dateFormat.parse(tempDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        System.out.println("Cinsiyet(E/K): ");
        Boolean inputForGender = true;
        if(ui.comboBoxCinsiyet.getSelectedIndex() == 0){
            inputForGender = true;
        }
        else if(ui.comboBoxCinsiyet.getSelectedIndex() == 1){
            inputForGender = false;
        }
//        if (inputForGender.equals("E")||inputForGender.equals("e")){
//            tempGender = true;
//        }
//        else if (inputForGender.equals("K")||inputForGender.equals("k")){
//            tempGender = false;
//        }else {
//            tempGender = null;
//        }

        persons.add(new person(tempRelation,tempName,tempSurname,date2,inputForGender));
        viewPersonInfo();
    }

    public void childrenAdder(relation relation, int relationID, int personID){
        relation.relations.get(relationID).children.add(persons.get(personID));
        persons.get(personID).parents = relation.relations.get(relationID);
    }

    public void brotherAdder(relation relation, int relationID, int relationdakiSpouseID){//spouse idye bastiriyo bunu bir daha islememiz gerekebilir.
        try {
            relation.brother.add(relation.relations.get(relationID).spouse1);
            relation.brother.add(relation.relations.get(relationID).spouse2);
            if (relation.relations.get(relationID).spouse1.birthday.after(relation.relations.get(relationID).spouse2.birthday)){
                if (relation.relations.get(relationID).spouse2.gender){
                    System.out.println("Abi adı: "+relation.brother.get(relationdakiSpouseID).name);
                }else {
                    System.out.println("Abla adı: "+relation.brother.get(relationdakiSpouseID).name);
                }
            }else {
                System.out.println("Kardeş adı: "+relation.brother.get(relationdakiSpouseID).name);
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    public void motherFather(){
        try {
            if (parents.spouse1.gender){
                parents.father.add(parents.spouse1);

                parents.mother.add(parents.spouse2);
                System.out.println("Baba adı: " + parents.spouse1.name + "\nAnne adı: " + parents.spouse2.name);
            }else if (parents.spouse2.gender){
                parents.father.add(parents.spouse2);
                parents.mother.add(parents.spouse1);
                System.out.println("Baba adı: " + parents.spouse2.name + "\nAnne adı: " + parents.spouse1.name);
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    public void kayinPederValide(relation relation, int relationID, int personID){
        try {
            if (persons.get(personID).parents.spouse1.gender){
                System.out.println("Kayınpeder: "+persons.get(personID).parents.spouse1.name);
                System.out.println("Kayınvalide: "+persons.get(personID).parents.spouse2.name);
            }else if (persons.get(personID).parents.spouse2.gender){
                System.out.println("Kayınpeder: "+persons.get(personID).parents.spouse2.name);
                System.out.println("Kayınvalide: "+persons.get(personID).parents.spouse1.name);
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    public void amcaHala(relation relation, int relationID, int personID, int childrenID){
        try {
            if (relation.relations.get(relationID).children.get(childrenID).gender){
                System.out.println("Amca: "+relation.relations.get(relationID).children.get(childrenID).name);
            }else {
                System.out.println("Hala: "+relation.relations.get(relationID).children.get(childrenID).name);
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    public void dayiTeyze(relation relation, int relationID, int personID, int childrenID){
        try {
            if (relation.relations.get(relationID).children.get(childrenID).gender){
                System.out.println("Dayı: "+relation.relations.get(relationID).children.get(childrenID).name);
            }else {
                System.out.println("Teyze: "+relation.relations.get(relationID).children.get(childrenID).name);
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    public void es(relation relation, int relationID){
        try {
            if (relation.relations.get(relationID).spouse1.gender)
                System.out.println("Es/ Kocam: "+relation.relations.get(relationID).spouse2.name);
            else {
                System.out.println("Es/ Karıcığım: "+relation.relations.get(relationID).spouse1.name);
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }


    public void grandParents(){
        try {

            if (parents.spouse1.parents.spouse1.gender) System.out.println("Dede adı: "+parents.spouse1.parents.spouse1.name+"\nBabaanne adı: "+parents.spouse1.parents.spouse2.name);
            else System.out.println("Dede adı: "+parents.spouse1.parents.spouse2.name+"\nBabaanne adı: "+parents.spouse1.parents.spouse1.name);
            if (parents.spouse2.parents.spouse1.gender) System.out.println("Dede adı: "+parents.spouse2.parents.spouse1.name+"\nAnneanne adı: "+parents.spouse2.parents.spouse2.name);
            else System.out.println("Dede adı: "+parents.spouse2.parents.spouse2.name+"\nAnneanne adı: "+parents.spouse2.parents.spouse1.name);
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    public void kuzen(relation relation, int relationID,int personId, int cousinID){
        try {

            if (persons.get(personId).id == relation.relations.get(relationID).children.get(cousinID).id){
                System.out.println("Kuzen: "+persons.get(personId).name);
            }else {
                System.out.println("Kuzen yok");
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    public void torun(relation relation, int dederelationID, int babarelationID, int childrenID, int torunID){
        try {
            if (relation.relations.get(dederelationID).children.get(childrenID).id == relation.relations.get(babarelationID).spouse1.id){
                if (!relation.relations.get(babarelationID).children.isEmpty()){
                    System.out.println("Torun: "+relation.relations.get(babarelationID).children.get(torunID).name);
                }
                else {
                    System.out.println("Torun yok!");
                }
            }
            else if (relation.relations.get(dederelationID).children.get(childrenID).id == relation.relations.get(babarelationID).spouse2.id){
                if (!relation.relations.get(babarelationID).children.isEmpty()){
                    System.out.println("Torun: "+relation.relations.get(babarelationID).children.get(torunID).name);
                }
                else {
                    System.out.println("Torun yok!");
                }
            }
        }catch (NullPointerException e){
            e.getMessage();
        }
    }

    public void showPersons(person person){
        for (int i=0; i<person.persons.size();i++){
            person.viewPersonInfo();
        }
    }

    public void viewPersonInfo(){
        System.out.println("Adı: "+name);
        System.out.println("Soyadı: "+surname);
        System.out.println("Doğum Tarihi: "+birthday);
        System.out.println("Cinsiyeti: "+gender);
        motherFather();
        grandParents();

        System.out.println();

    }

    public person(projePack.relation parents, String name, String surname, Date birthday, Boolean gender){
        this.parents = parents;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        id = personCounter;
        personCounter++;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public relation getParents() {
        return parents;
    }

    public void setParents(relation parents) {
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}


