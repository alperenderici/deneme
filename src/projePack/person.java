package projePack;

import java.util.ArrayList;

public class person extends main {
    relation parents;
    String name;
    String surname;
    String birthday;
    String gender;
    ArrayList <relation> relation = new ArrayList<relation>();

    public person(relation parents, String name, String surname, String birthday, String gender, ArrayList<relation> relation) {
        this.parents = parents;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.gender = gender;
        this.relation = relation;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<relation> getRelation() {
        return relation;
    }

    public void setRelation(ArrayList<relation> relation) {
        this.relation = relation;
    }

}
